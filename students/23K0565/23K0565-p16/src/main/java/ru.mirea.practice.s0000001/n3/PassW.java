package ru.mirea.practice.s0000001.n3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;

public class PassW extends JFrame {

    public PassW() {
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

    public static void main(String[] args) {
        new PassW().setVisible(true);
    }
}
