package ru.mirea.practice.s0000001.task3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChecker extends JFrame {
    private JTextField service;
    private JTextField user;
    private JPasswordField password;
    private static final String myService = "qwer";
    private static final String myUser = "A.P.D.";
    private static final String myPassword = "1";

    public PasswordChecker() {
        super("Password Checker");
        setLayout(new GridLayout(4, 2, 10, 10));
        setSize(400, 200);
        service = new JTextField(10);
        user = new JTextField(10);
        password = new JPasswordField(10);
        final JButton checkButton = new JButton("Check out:");
        add(new JLabel("Service:"));
        add(service);
        add(new JLabel("User name:"));
        add(user);
        add(new JLabel("Password:"));
        add(password);
        add(new JLabel(""));
        add(checkButton);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enSer = service.getText();
                String enUs = user.getText();
                String enPas = new String(password.getPassword());
                if (myService.equals(enSer) && myUser.equals(enUs) && myPassword.equals(enPas)) {
                    JOptionPane.showMessageDialog(null, "Sucess", "ANSWER", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed!", "ERORR", 2);
                }
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PasswordChecker();
    }
}
