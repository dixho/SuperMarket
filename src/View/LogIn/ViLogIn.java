package View.LogIn;

import javax.swing.*;

public class ViLogIn extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton iniciarSesiónButton;
    private JPanel mainPanel;

    public ViLogIn(){

       add(mainPanel);

       setConfig();

    }

    private void setConfig() {

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);

    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(JPasswordField passwordField1) {
        this.passwordField1 = passwordField1;
    }

    public JButton getIniciarSesionButton() {
        return iniciarSesiónButton;
    }

    public void setIniciarSesionButton(JButton iniciarSesiónButton) {
        this.iniciarSesiónButton = iniciarSesiónButton;
    }

    public Object[] getInputs(){

        Object a[] = {getTextField1(),getPasswordField1()};
        return a;

    }

    public Object getInputs(int index){

        Object a[] = {getTextField1(),getPasswordField1()};
        return a[index];

    }

    public void clearForm() {

        passwordField1.setText("");
        textField1.setText("");

    }
}
