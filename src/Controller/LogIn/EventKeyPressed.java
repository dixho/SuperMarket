package Controller.LogIn;

import View.LogIn.LogIn;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventKeyPressed implements KeyListener {

    CoLogIn coLogIn;
    LogIn w;
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
            coLogIn.checkLogIn(w);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
