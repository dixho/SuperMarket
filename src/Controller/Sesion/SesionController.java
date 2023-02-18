package Controller.Sesion;

import Model.Employee;
import View.Sesion.MainWindow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SesionController {
    private Employee employee;
    public SesionController(Employee employee) {
        this.employee = employee;
        MainWindow w = new MainWindow(this.employee);

         addListeners(w);

    }

    private void addListeners(MainWindow w) {

        w.getStartButton().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    startTPV(w);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    w.getExitButton().grabFocus();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        w.getStartButton().addActionListener(e -> {
            startTPV(w);
        });

        w.getExitButton().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    System.exit(0);
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    w.getStartButton().grabFocus();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        w.getExitButton().addActionListener(e -> {
            System.exit(0);
        });

    }

    private void startTPV(MainWindow w) {
        w.dispose();
        TPVController tpvController = new TPVController(employee);
    }
}
