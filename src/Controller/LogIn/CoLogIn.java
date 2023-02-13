package Controller.LogIn;

import Controller.Sesion.Sesion;
import Model.Employees;
import View.LogIn.LogIn;
import View.LogIn.LogInError;

public class CoLogIn {

    Employees employees;
    public CoLogIn() {
        this.employees = new Employees();
        LogIn logIn = new LogIn();

        addListeners(logIn);
    }

    private void addListeners(LogIn w) {

        w.getIniciarSesiónButton().addActionListener(e -> {
            checkLogIn(w);
        });

        w.getPasswordField1().addKeyListener(new EventKeyPressed(this,w));

        w.getTextField1().addKeyListener(new EventKeyPressed(this,w));

    }

    public void checkLogIn(LogIn w) {
        if (w.getPasswordField1().getPassword().length > 0 || !w.getTextField1().getText().isEmpty()){
            String user = w.getTextField1().getText();
            String pass = String.valueOf(w.getPasswordField1().getPassword());

            boolean check = false;
            int index = 0;

            for (int i = 0; i < employees.getEmployees().size() ; i++) {
                if (employees.getEmployees(i).getUser().equals(user) && employees.getEmployees(i).getPass().equals(pass)){
                    check = true;
                    index = i;
                }
            }
            if(check){
                System.out.println("encontrado");
                w.dispose();
                new Sesion(employees.getEmployees(index));
            } else{
                System.out.println("No existe");
                throwError(w,"Usuario o contraseña incorrecta");
            }
        } else {
            throwError(w,"Formulario en blanco");
        }
    }

    private void throwError(LogIn w ,String s) {
        w.clearForm();
        LogInError error = new LogInError(s);
    }

    private void checkPass(String pass, Employees employees) {



    }
}
