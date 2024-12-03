package ru.mirea.practice.s23k0755.task2;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordChecker extends JFrame {
    private JTextField serviceField;
    private JTextField usernameField;
    private JTextField passwordField;
    private JLabel resultLabel;

    public PasswordChecker() {
        setTitle("Проверка пароля");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создание панели для ввода данных
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2)); // 4 строки и 2 колонки

        // Создание компонентов ввода
        final JLabel serviceLabel = new JLabel("ССервис:");
        serviceField = new JTextField();

        final JLabel usernameLabel = new JLabel("Имя пользователя:");
        usernameField = new JTextField();

        final JLabel passwordLabel = new JLabel("Пароль:");
        passwordField = new JTextField();

        // Локальная переменная для кнопки
        JButton checkButton = new JButton("Проверить");

        // Добавление компонентов на панель
        inputPanel.add(serviceLabel);
        inputPanel.add(serviceField);
        inputPanel.add(usernameLabel);
        inputPanel.add(usernameField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordField);
        inputPanel.add(new JLabel()); // Пустая ячейка
        inputPanel.add(checkButton);

        // Добавление панели ввода в основное окно
        add(inputPanel, BorderLayout.CENTER);

        // Создание метки для отображения результата
        resultLabel = new JLabel(" ");
        add(resultLabel, BorderLayout.SOUTH);

        // Обработчик события нажатия кнопки
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String service = serviceField.getText();
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (isValidPassword(password)) {
                    resultLabel.setText("Пароль для " + service + " (" + username + ") верный!");
                    resultLabel.setForeground(Color.GREEN);
                } else {
                    resultLabel.setText("Пароль для " + service + " (" + username + ") не соответствует требованиям.");
                    resultLabel.setForeground(Color.RED);
                }
            }
        });
    }

    private boolean isValidPassword(String password) {
        // Проверка длины пароля
        if (password.length() < 8) {
            return false;
        }
        // Проверка наличия цифр
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        // Проверка наличия специальных символов
        return password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }
}
