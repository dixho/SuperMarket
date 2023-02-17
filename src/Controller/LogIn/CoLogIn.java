package Controller.LogIn;

import Controller.DB.DBConnection;
import Controller.Sesion.Sesion;
import Model.Employee;
import Model.Employees;
import View.LogIn.LogIn;
import View.LogIn.LogInError;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoLogIn {

    public CoLogIn() {
        
        LogIn logIn = new LogIn();

        addListeners(logIn);
    }

    private void addListeners(LogIn w) {

        w.getIniciarSesiónButton().addActionListener(e -> {
            try {
                checkLogIn(w);
            } catch (SQLException | ClassNotFoundException ex) {
                throwError(w,ex.getMessage());
                throw new RuntimeException(ex);
            }
        });

        w.getPasswordField1().addKeyListener(new EventKeyPressed(this,w));

        w.getTextField1().addKeyListener(new EventKeyPressed(this,w));

    }

    public void checkLogIn(LogIn w) throws SQLException, ClassNotFoundException {
        if (w.getPasswordField1().getPassword().length > 0 && !w.getTextField1().getText().isEmpty()) {
            String user = w.getTextField1().getText();
            String pass = String.valueOf(w.getPasswordField1().getPassword());

            ResultSet rs = new DBConnection().doQuery("SELECT * FROM employees WHERE user LIKE '" + user + "' AND password LIKE '" + pass + "'");

            if (rs.next()) {
                w.dispose();
                new Sesion(new Employee(rs.getInt("ID"), rs.getString("user"), rs.getString("name"), rs.getString("surname"), rs.getFloat("discount")));
            } else {
                throwError(w, "Usuario o contraseña incorrecta.");

            }
        }
    }

    public void throwError(LogIn w ,String s) {
        w.clearForm();
        LogInError error = new LogInError(s);
    }

    private void checkPass(String pass, Employees employees) {



    }
}
