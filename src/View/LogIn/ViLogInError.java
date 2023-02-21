package View.LogIn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViLogInError extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel ErrorMessage;

    public ViLogInError(String s) {

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        ErrorMessage.setText(s);
        pack();
        setVisible(true);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        ViLogInError dialog = new ViLogInError("");
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
