package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;

public class PasswordApplication extends JFrame {
    public PasswordApplication() {
        setTitle("Password application");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 2, 5, 5));

        // Declaring variables as final
        final JLabel serviceLabel = new JLabel("Service:");
        final JTextField serviceField = new JTextField();

        final JLabel userLabel = new JLabel("User name:");
        final JTextField userField = new JTextField();

        final JLabel passwordLabel = new JLabel("Password:");
        final JPasswordField passwordField = new JPasswordField();

        add(serviceLabel);
        add(serviceField);
        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PasswordApplication();
    }
}