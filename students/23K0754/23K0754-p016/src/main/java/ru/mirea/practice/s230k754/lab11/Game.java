package ru.mirea.practice.s230k754.lab11;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Game extends JFrame {
    private final JLabel guessLabel;
    private final JLabel resultLabel;
    private final JTextField guessField;
    private final JButton guessButton;
    private final int secretNumber;
    private int attemptsLeft;

    public Game() {
        super("Угадай число!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Создаем макет
        setLayout(new GridLayout(4, 1));

        // Создаем метки и текстовое поле

        guessLabel = new JLabel("Осталось попыток: 3");
        resultLabel = new JLabel("");
        guessField = new JTextField();

        // Создаем кнопку
        guessButton = new JButton("Угадать");
        guessButton.addActionListener(this::actionPerformed);

        // Добавляем компоненты в макет
        JLabel promptLabel = new JLabel("Угадайте число от 0 до 3:");
        add(promptLabel);
        add(guessField);
        add(guessLabel);
        add(guessButton);
        add(resultLabel);

        // Генерируем случайное число
        secretNumber = (int) (Math.random() * 4);

        // Инициализируем счетчик попыток
        attemptsLeft = 3;
    }

    public void actionPerformed(ActionEvent e) {
        if (Objects.equals(e.getSource(), guessButton)) {
            attemptsLeft--;
            guessLabel.setText("Осталось попыток: " + attemptsLeft);
            try {
                int guess = Integer.parseInt(guessField.getText());
                if (Objects.equals(guess,secretNumber)) {
                    resultLabel.setText("Поздравляем! Вы угадали!");
                    guessButton.setEnabled(false);
                } else if (attemptsLeft == 0) {
                    resultLabel.setText("Вы исчерпали все попытки. Число было: " + secretNumber);
                    guessButton.setEnabled(false);
                } else if (guess < secretNumber) {
                    resultLabel.setText("Загаданное число больше.");
                } else {
                    resultLabel.setText("Загаданное число меньше.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Введите число!");
            }
            guessField.setText("");
        }
    }
}
