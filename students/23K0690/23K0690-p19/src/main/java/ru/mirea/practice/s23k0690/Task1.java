package ru.mirea.practice.s23k0690;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Task1 {
    public static void main(String[] args) {
        final JLabel usernameLabel = new JLabel("Имя пользователя:");
        final JTextField usernameInput = new JTextField(10);
        final JLabel passwordLabel = new JLabel("ИНН:");
        final JTextField passwordInput = new JTextField(10);

        ServiceUser userAccount = new ServiceUser("Sergey", "123456789012");
        JButton verifyButton = new JButton("Войти");
        JLabel feedbackLabel = new JLabel("");

        JFrame frame = new JFrame("Проверка данных");
        frame.setLayout(new GridLayout(5, 2));

        verifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int score = 0;
                if (usernameInput.getText().equals(userAccount.getUser())) {
                    score++;
                }
                if (passwordInput.getText().equals(userAccount.getPass())) {
                    score++;
                }
                if (score == 2) {
                    feedbackLabel.setText("Действителен номер ИНН " + userAccount.getUser());
                } else {
                    feedbackLabel.setText("Неправильные данные");
                }
            }
        });

        frame.add(usernameLabel);
        frame.add(usernameInput);
        frame.add(passwordLabel);
        frame.add(passwordInput);
        frame.add(verifyButton);
        frame.add(feedbackLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
}