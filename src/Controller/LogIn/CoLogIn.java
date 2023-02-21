package Controller.LogIn;

import Controller.DB.CoDBConnection;
import Controller.Sesion.CoSesion;
import Model.Employee;
import Model.Employees;
import View.LogIn.ViLogIn;
import View.LogIn.ViLogInError;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoLogIn {

    public CoLogIn() {
        
        ViLogIn logIn = new ViLogIn();

        addListeners(logIn);
    }

    private void addListeners(ViLogIn w) {

        w.getIniciarSesionButton().addActionListener(e -> {
            try {
                checkLogIn(w);
            } catch (SQLException | ClassNotFoundException ex) {
                throwError(w,ex.getMessage());
                throw new RuntimeException(ex);
            }
        });

        w.getIniciarSesionButton().addKeyListener(new EventKeyPressed(this,w));

        w.getPasswordField1().addKeyListener(new EventKeyPressed(this,w));

        w.getTextField1().addKeyListener(new EventKeyPressed(this,w));

    }

    public void checkLogIn(ViLogIn w) throws SQLException, ClassNotFoundException {
        if (w.getPasswordField1().getPassword().length > 0 && !w.getTextField1().getText().isEmpty()) {
            String user = w.getTextField1().getText();
            String pass = String.valueOf(w.getPasswordField1().getPassword());

            ResultSet rs = new CoDBConnection().doQuery("SELECT * FROM employees WHERE user LIKE '" + user + "' AND password LIKE '" + pass + "'");

            if (rs.next()) {
                w.dispose();
                new CoSesion(new Employee(rs.getInt("ID"), rs.getString("user"), rs.getString("name"), rs.getString("surname"), rs.getFloat("discount")));
            } else {
                throwError(w, "Usuario o contraseña incorrecta.");

            }
        }
    }

    public void throwError(ViLogIn w , String s) {
        w.clearForm();
        ViLogInError error = new ViLogInError(s);
    }

    private void checkPass(String pass, Employees employees) {



    }
}
