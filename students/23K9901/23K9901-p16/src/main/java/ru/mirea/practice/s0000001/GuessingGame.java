package ru.mirea.practice.s0000001;

import javax.swing.JOptionPane;
import java.util.Random;

public class GuessingGame {
    private int numberToGuess;
    private int attempts;

    public GuessingGame() {
        this.attempts = 3;
        this.numberToGuess = new Random().nextInt(21);
    }

    public void guess(int userGuess) {
        if (userGuess == numberToGuess) {
            JOptionPane.showMessageDialog(null, "Поздравляем! Вы угадали число: " + numberToGuess);
            System.exit(0);
        } else {
            attempts--;
            if (attempts > 0) {
                String hint = userGuess < numberToGuess ? "больше" : "меньше";
                JOptionPane.showMessageDialog(null, "Неправильно! Попробуйте число " + hint + ". Осталось попыток: " + attempts);
            } else {
                JOptionPane.showMessageDialog(null, "Вы исчерпали все попытки! Загаданное число: " + numberToGuess);
                System.exit(0);
            }
        }
    }
}
