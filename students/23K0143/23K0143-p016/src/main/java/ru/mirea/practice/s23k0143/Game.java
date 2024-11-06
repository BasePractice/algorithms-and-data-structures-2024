package ru.mirea.practice.s23k0143;

import java.util.Random;
import java.util.Scanner;

public abstract class Game {
    public static void main(String[] args) {

        int secretNumber = new Random().nextInt(21);
        int attemptsLeft = 3;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Добро пожаловать в игру!");
            System.out.println("Попробуйте угадать число от 0 до 20");

            while (attemptsLeft > 0) {
                System.out.print("Введите ваше предположение: ");
                int guess = scanner.nextInt();

                if (guess < 0 || guess > 20) {
                    System.out.println("Пожалуйста, введите число от 0 до 20");
                    continue;
                }

                attemptsLeft--;

                if (guess == secretNumber) {
                    System.out.println("Поздравляю! Вы угадали число!");
                    break;
                } else if (attemptsLeft > 0) {
                    if (guess < secretNumber) {
                        System.out.println("Неправильно! Попробуйте больше. Осталось попыток: " + attemptsLeft);
                    } else {
                        System.out.println("Неправильно! Попробуйте меньше. Осталось попыток: " + attemptsLeft);
                    }
                } else {
                    System.out.println("Вы исчерпали все попытки! Загаданное число: " + secretNumber);
                }
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
