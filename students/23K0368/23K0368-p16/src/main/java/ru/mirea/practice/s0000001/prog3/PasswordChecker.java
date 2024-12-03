package ru.mirea.practice.s0000001.prog3;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class PasswordChecker extends JFrame {
    private JFrame serviceFrame;
    private JFrame usernameFrame;

    public PasswordChecker() {
        // Создаем первое окно для выбора сервиса
        createServiceFrame();
    }

    // Первое окно: выбор сервиса
    private void createServiceFrame() {
        serviceFrame = new JFrame("Выбор сервиса");
        serviceFrame.setSize(400, 200);
        serviceFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        serviceFrame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 1));
        JLabel label = new JLabel("Выберите сервис:", SwingConstants.CENTER);
        JLabel label1 = new JLabel("Программа проверяет пароль на правильность по маске", SwingConstants.CENTER);
        String[] services = {"Email", "Z-Bank"};
        JComboBox<String> serviceComboBox = new JComboBox<>(services);

        panel.add(label);
        panel.add(label1);
        panel.add(serviceComboBox);

        JButton nextButton = new JButton("Далее");
        nextButton.addActionListener(e -> showUsernameFrame());

        serviceFrame.add(panel, BorderLayout.CENTER);
        serviceFrame.add(nextButton, BorderLayout.SOUTH);
        serviceFrame.setVisible(true);
    }

    // Второе окно: ввод имени пользователя
    private void showUsernameFrame() {
        serviceFrame.setVisible(false);  // Скрываем первое окно

        usernameFrame = new JFrame("Введите имя пользователя");
        usernameFrame.setSize(300, 150);
        usernameFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        usernameFrame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 1));
        JLabel label = new JLabel("Имя пользователя:");
        JTextField usernameField = new JTextField();

        panel.add(label);
        panel.add(usernameField);

        JButton nextButton = new JButton("Далее");
        nextButton.addActionListener(e -> showPasswordFrame());

        usernameFrame.add(panel, BorderLayout.CENTER);
        usernameFrame.add(nextButton, BorderLayout.SOUTH);
        usernameFrame.setVisible(true);
    }

    // Третье окно: ввод пароля
    private void showPasswordFrame() {
        usernameFrame.setVisible(false);  // Скрываем второе окно

        JFrame passwordFrame = new JFrame("Введите пароль");
        passwordFrame.setSize(300, 150);
        passwordFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        passwordFrame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3, 1));
        JLabel label = new JLabel("Пароль:");
        JPasswordField passwordField = new JPasswordField();

        panel.add(label);
        panel.add(passwordField);

        JButton checkButton = new JButton("Войти");
        checkButton.addActionListener(e -> checkPassword(passwordField));

        JLabel resultLabel = new JLabel("", SwingConstants.CENTER);

        passwordFrame.add(panel, BorderLayout.CENTER);
        passwordFrame.add(checkButton, BorderLayout.SOUTH);
        passwordFrame.add(resultLabel, BorderLayout.NORTH);
        passwordFrame.setVisible(true);
    }

    // Проверка пароля
    private void checkPassword(JPasswordField passwordField) {
        String password = new String(passwordField.getPassword());

        // Простейшая проверка пароля
        if (password.length() >= 8 && password.matches(".*\\d.*") && password.matches(".*[a-zA-Z].*")) {
            JOptionPane.showMessageDialog(this, "Пароль корректен!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(this, "Пароль некорректен!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PasswordChecker());
    }
}
