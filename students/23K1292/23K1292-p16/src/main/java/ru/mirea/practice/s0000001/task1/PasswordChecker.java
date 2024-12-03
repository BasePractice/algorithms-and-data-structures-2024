package ru.mirea.practice.s0000001.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChecker extends JFrame {

    private JTextField usernameField;
    private JTextField passwordField;
    private JLabel resultLabel;

    public PasswordChecker() {

        setTitle("Проверка пароля");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));


        usernameField = new JTextField(15);
        inputPanel.add(new JLabel("Имя пользователя:"));
        inputPanel.add(usernameField);


        passwordField = new JTextField(15);
        inputPanel.add(new JLabel("Введите пароль:"));
        inputPanel.add(passwordField);


        JButton checkButton = new JButton("Проверить");
        inputPanel.add(checkButton);


        resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);


        add(inputPanel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);


        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCredentials();
            }
        });


        setVisible(true);
    }

    private void checkCredentials() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if ("user".equals(username) && "12345".equals(password)) {
            resultLabel.setText("Доступ разрешен!");
        } else {
            resultLabel.setText("Неверное имя пользователя или пароль!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordChecker::new);
    }
}
