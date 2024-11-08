package ru.mirea.practice.s230k754.lab11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Password extends JFrame {
    public Password() {
        setTitle("Password application");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceField = new JTextField();

        JLabel userLabel = new JLabel("User name:");
        JTextField userField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        panel.add(serviceLabel);
        panel.add(serviceField);
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        add(panel);
    }
}
