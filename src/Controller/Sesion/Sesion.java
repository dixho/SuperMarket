package Controller.Sesion;

import Model.Employee;
import View.Sesion.MainWindow;

public class Sesion {

    MainWindow w;
    public Sesion(Employee employee) {

         this.w = new MainWindow(employee);

         addListeners();

    }

    private void addListeners() {

        w.getExitButton().addActionListener(e -> {
            System.exit(0);
        });

    }
}
