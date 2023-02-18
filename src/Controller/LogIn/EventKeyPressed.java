package Controller.LogIn;

import View.LogIn.LogIn;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

public class EventKeyPressed implements KeyListener {

    private CoLogIn coLogIn;
    private LogIn w;
    public EventKeyPressed(CoLogIn coLogIn, LogIn w){
        this.coLogIn = coLogIn;
        this.w = w;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                coLogIn.checkLogIn(w);
            } catch (SQLException ex) {
                coLogIn.throwError(w,ex.getMessage());
            } catch (ClassNotFoundException ex) {
                coLogIn.throwError(w,ex.getMessage());
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
