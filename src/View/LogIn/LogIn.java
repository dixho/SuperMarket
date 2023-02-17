package View.LogIn;

import javax.swing.*;
import javax.swing.text.Element;
import java.io.File;
import java.io.IOException;
import javax.swing.text.html.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LogIn extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton iniciarSesiónButton;
    private JPanel mainPanel;

    public LogIn(){

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

    public JButton getIniciarSesiónButton() {
        return iniciarSesiónButton;
    }

    public void setIniciarSesiónButton(JButton iniciarSesiónButton) {
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
