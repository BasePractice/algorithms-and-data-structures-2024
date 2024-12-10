package ru.mirea.practice.s23k0140.task1;

import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int secretNumber = random.nextInt(21);
            int attemptsLeft = 3;
            boolean isGuessed = false;

            System.out.println("Добро пожаловать в игру 'Угадай число'!");
            System.out.println("Загадано число от 0 до 20. У вас есть 3 попытки, чтобы его угадать.");

            while (attemptsLeft > 0 && !isGuessed) {
                System.out.print("Введите ваше предположение: ");
                try {
                    int userGuess = scanner.nextInt();

                    if (userGuess < 0 || userGuess > 20) {
                        System.out.println("Пожалуйста, введите число в диапазоне от 0 до 20.");
                        continue;
                    }

                    if (userGuess == secretNumber) {
                        isGuessed = true;
                        System.out.println("Поздравляем! Вы угадали число " + secretNumber + "!");
                    } else {
                        attemptsLeft--;
                        if (userGuess < secretNumber) {
                            System.out.println("Неверно! Загаданное число больше.");
                        } else {
                            System.out.println("Неверно! Загаданное число меньше.");
                        }

                        if (attemptsLeft > 0) {
                            System.out.println("У вас осталось " + attemptsLeft + " попыток(и).");
                        } else {
                            System.out.println("Вы исчерпали все попытки. Загаданное число было " + secretNumber + ".");
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                    scanner.next();
                }

                System.out.println();
            }

            System.out.println("Спасибо за игру!");
        }
    }
}