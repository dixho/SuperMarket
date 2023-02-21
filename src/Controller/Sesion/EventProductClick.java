package Controller.Sesion;

import View.Sesion.ProductTicket;
import View.Sesion.ViTPV;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventProductClick implements ActionListener {

    private ViTPV w;
    public EventProductClick(ViTPV w) {
        this.w = w;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();
        w.getTicketPanel().add(new ProductTicket(clicked.getText()));

        w.refresh();
    }
}
