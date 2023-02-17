package View.Sesion;

import javax.swing.*;
import java.awt.*;

public class ViTPV extends JFrame{
    private JPanel mainPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton cButton;
    private JButton a0Button;
    private JButton commaButton;

    public ViTPV(){

        add(mainPanel);
        setConfig();

    }

    private void setConfig() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Falta crear metodo para cerrar sesión
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        
        setVisible(true);
    }
}
