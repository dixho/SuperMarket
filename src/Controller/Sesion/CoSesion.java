package Controller.Sesion;

import Model.Employee;
import Model.SesionData;
import View.Sesion.ViMainWindow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CoSesion {
    private Employee employee;
    public CoSesion(Employee employee) {
        this.employee = employee;
        SesionData sesionData = new SesionData(employee);
        ViMainWindow w = new ViMainWindow(sesionData);

         addListeners(w,sesionData);

    }

    private void addListeners(ViMainWindow w, SesionData sesionData) {

        w.getStartButton().addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    startTPV(w,sesionData);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    w.getExitButton().grabFocus();
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        w.getStartButton().addActionListener(e -> {
            startTPV(w, sesionData);
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

    private void startTPV(ViMainWindow w, SesionData sesionData) {
        w.dispose();
        CoTPV tpvController = new CoTPV(sesionData);
    }
}
