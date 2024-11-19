package ru.mirea.practice.s23k0093;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class GuessingGame extends JFrame {
    private final JTextField guessField;
    private final int randomNumber;
    private int attempts;

    public GuessingGame() {
        setTitle("Игра Угадай Число");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создание компонентов
        guessField = new JTextField();
        JButton guessButton = new JButton("Угадать");
        JLabel messageLabel = new JLabel("Введите число от 0 до 20:");

        // Добавление компонентов в окно
        add(guessField, BorderLayout.CENTER);
        add(guessButton, BorderLayout.SOUTH);
        add(messageLabel, BorderLayout.NORTH);

        // Генерация случайного числа
        randomNumber = new Random().nextInt(21);
        attempts = 0;

        // Обработчик нажатия кнопки
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeGuess();
            }
        });

        // Обработчики событий мыши для разных областей
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getY() < 50) {
                    showMessage("Добро пожаловать в САО");
                } else if (e.getY() > 250) {
                    showMessage("Добро пожаловать ЮАО");
                } else if (e.getX() < 150) {
                    showMessage("Добро пожаловать в ЗАО");
                } else if (e.getX() > 250) {
                    showMessage("Добро пожаловать в ВАО");
                } else {
                    showMessage("Добро пожаловать в ЦАО");
                }
            }
        });
    }

    private void makeGuess() {
        try {
            int userGuess = Integer.parseInt(guessField.getText());
            attempts++;

            if (userGuess == randomNumber) {
                JOptionPane.showMessageDialog(this, "Поздравляем! Вы угадали число!");
                System.exit(0);
            } else if (attempts >= 3) {
                JOptionPane.showMessageDialog(this, "Вы исчерпали все попытки! Загаданное число было: " + randomNumber);
                System.exit(0);
            } else {
                String hint = userGuess < randomNumber ? "Больше!" : "Меньше!";
                JOptionPane.showMessageDialog(this, "Неправильно! Попробуйте еще раз. Подсказка: " + hint);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Пожалуйста, введите корректное число!");
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GuessingGame game = new GuessingGame();
            game.setVisible(true);
        });
    }
}
