package View.Sesion;

import Controller.Sesion.EventProductClick;
import Controller.Sesion.EventCategoryClick;
import Model.Category;
import Model.SesionData;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
    private JPanel categoryPanel;
    private JPanel productPanel;
    private JPanel cashierPanel;
    private JPanel ticketPanel;
    private JScrollPane ticketScrollPane;

    private SesionData sesionData;

    public ViTPV(ArrayList<Category> categories, SesionData sesionData){
        this.sesionData = sesionData;

        add(mainPanel);

        setProducts(categories);
        setConfig();

    }

    public void setCategories(ArrayList<Category> categories) {


        for (int i = 0; i < categories.size() ; i++) {
            JButton add = new JButton(categories.get(i).getName());
            add.addActionListener(new EventCategoryClick(this,categories));
            getCategoryPanel().add(add);
        }

        refresh();
    }

    public void setProducts(Category category){

        if (productPanel.getComponentCount() > 0){

            productPanel.removeAll();
            refresh();
        }

        if(sesionData.getActualCategory() == null || category != sesionData.getActualCategory()){
            sesionData.setActualCategory(category);
            for (int i = 0; i < category.getProducts().size(); i++) {
                JButton add = new JButton(category.getProducts(i).getName());
                add.addActionListener(new EventProductClick(this));
                productPanel.add(add);
            }
        }




    }

    public void setProducts(ArrayList<Category> categories){
        for (int i = 0; i < categories.size() ; i++) {
            for (int j = 0; j < categories.get(i).getProducts().size() ; j++) {
                productPanel.add(new JButton(categories.get(i).getProducts(j).getName()));
            }
        }
    }

    private void setConfig() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);  // Falta crear metodo para cerrar sesión
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setResizable(false);
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

    public JPanel getProductsPanel() {
        return productsPanel;
    }

    public void setProductsPanel(JPanel productsPanel) {
        this.productsPanel = productsPanel;
    }

    public JPanel getTicketPanel() {
        return ticketPanel;
    }

    public void setTicketPanel(JPanel ticketPanel) {
        this.ticketPanel = ticketPanel;
    }
}
