package View.Sesion;

import Model.Employee;
import Model.SesionData;

import javax.swing.*;
import java.awt.*;

public class ViMainWindow extends JFrame{
    private JPanel mainPanel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel idLabel;
    private JButton startButton;
    private JButton exitButton;
    
    public ViMainWindow(SesionData sesionData){
        
        setName(sesionData.getEmployee());
        add(mainPanel);
        setConfig();
    }

    private void setName(Employee employee) {

        idLabel.setText(employee.getId()+"");
        nameLabel.setText(employee.getName());
        surnameLabel.setText(employee.getSurname());


    }

    private void setConfig() {

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setSize((int) ((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 0.8), (int) ((int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() * 0.8));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void setExitButton(JButton exitButton) {
        this.exitButton = exitButton;
    }
}
