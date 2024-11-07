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
        // Устанавливаем заголовок окна
        setTitle("Проверка пароля");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создаем панель для ввода имени пользователя и пароля
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2)); // Используем GridLayout для удобного размещения

        // Создаем текстовое поле для имени пользователя
        usernameField = new JTextField(15);
        inputPanel.add(new JLabel("Имя пользователя:"));
        inputPanel.add(usernameField);

        // Создаем текстовое поле для пароля
        passwordField = new JTextField(15);
        inputPanel.add(new JLabel("Введите пароль:"));
        inputPanel.add(passwordField);

        // Создаем кнопку для проверки пароля
        JButton checkButton = new JButton("Проверить");
        inputPanel.add(checkButton);

        // Создаем метку для отображения результата
        resultLabel = new JLabel("");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Добавляем панель ввода и метку результата в окно
        add(inputPanel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);

        // Обработчик события для кнопки проверки пароля
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkCredentials();
            }
        });

        // Делаем окно видимым
        setVisible(true);
    }

    private void checkCredentials() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        if ("user".equals(username) && "12345".equals(password)) { // Переместили литералы для сравнения
            resultLabel.setText("Доступ разрешен!");
        } else {
            resultLabel.setText("Неверное имя пользователя или пароль!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordChecker::new);
    }
}
