package Controller.Sesion;

import Model.Employee;
import View.Sesion.MainWindow;
import View.Sesion.ViTPV;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Sesion {

    MainWindow w;
    public Sesion(Employee employee) {

         this.w = new MainWindow(employee);

         addListeners();

    }

    private void addListeners() {

        w.getStartButton().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    startTPV();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    w.getExitButton().grabFocus();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        w.getStartButton().addActionListener(e -> {
            startTPV();
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

    private void startTPV() {
        w.dispose();
        ViTPV wTPV = new ViTPV();
    }
}
