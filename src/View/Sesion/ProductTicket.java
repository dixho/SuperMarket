package View.Sesion;

import javax.swing.*;
import java.awt.*;

public class ProductTicket extends JPanel {

    public ProductTicket(String text){
        setConfig();
        System.out.println("Entra");
        add(new JLabel(text));
        setBackground(Color.CYAN);
        setVisible(true);
    }

    private void setConfig() {

        setSize(100,100);

    }

}
