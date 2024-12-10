package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumberGame extends JFrame {
    private int targetNumber;
    private int attemptsLeft;
    private JLabel messageLabel;
    private JTextField guessField;
    private JButton guessButton;

    public GuessNumberGame() {
        setTitle("Игра 'Угадай число'");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        targetNumber = (int) (Math.random() * 21);
        attemptsLeft = 3;

        messageLabel = new JLabel("Угадайте число от 0 до 20. У вас 3 попытки.");
        add(messageLabel);

        guessField = new JTextField(5);
        add(guessField);

        guessButton = new JButton("Угадать");
        add(guessButton);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = guessField.getText();
                try {
                    int userGuess = Integer.parseInt(input);

                    if (userGuess < 0 || userGuess > 20) {
                        messageLabel.setText("Число должно быть между 0 и 20!");
                    } else {
                        attemptsLeft--;

                        if (userGuess == targetNumber) {
                            messageLabel.setText("Поздравляем! Вы угадали число.");
                            guessButton.setEnabled(false);
                        } else if (attemptsLeft > 0) {
                            if (userGuess < targetNumber) {
                                messageLabel.setText("Число больше! Осталось попыток: " + attemptsLeft);
                            } else {
                                messageLabel.setText("Число меньше! Осталось попыток: " + attemptsLeft);
                            }
                        } else {
                            messageLabel.setText("Вы проиграли! Правильное число было: " + targetNumber);
                            guessButton.setEnabled(false);
                        }
                    }
                } catch (NumberFormatException ex) {
                    messageLabel.setText("Пожалуйста, введите число!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new GuessNumberGame();
    }
}
