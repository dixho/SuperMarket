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
    private JPanel productsPanel;
    private JButton button7;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JPanel categoryPanel;
    private JPanel productPanel;
    private JPanel cashierPanel;

    public ViTPV(){

        add(mainPanel);
        setConfig();

    }

    private void setConfig() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Falta crear metodo para cerrar sesión
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void refresh(){
        setVisible(false);
        setVisible(true);
    }

    public void createCategorys(int id, String name){
        JScrollPane scrollPane = new JScrollPane();

    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public JPanel getCategoryPanel() {
        return categoryPanel;
    }

    public void setCategoryPanel(JPanel categoryPanel) {
        this.categoryPanel = categoryPanel;
    }

    public JPanel getProductPanel() {
        return productPanel;
    }

    public void setProductPanel(JPanel productPanel) {
        this.productPanel = productPanel;
    }

    public JPanel getCashierPanel() {
        return cashierPanel;
    }

    public void setCashierPanel(JPanel cashierPanel) {
        this.cashierPanel = cashierPanel;
    }
}
