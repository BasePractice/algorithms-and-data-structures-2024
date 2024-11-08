package ru.mirea.practice.s23k0155;

import java.util.Scanner;

public abstract class GuessTheNumberGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            final int targetNumber = (int) (Math.random() * 21); // случайное число от 0 до 20
            final int attempts = 3; // количество попыток

            System.out.println("Добро пожаловать в игру 'Угадай число'!");
            System.out.println("Попробуйте угадать число от 0 до 20. У вас есть " + attempts + " попытки.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Попытка " + i + ": Введите ваше предположение: ");
                int guess = scanner.nextInt();

                if (guess == targetNumber) {
                    System.out.println("Поздравляем! Вы угадали число " + targetNumber + " с " + i + " попытки.");
                    return; // завершить программу, если число угадано
                } else if (guess < targetNumber) {
                    System.out.println("Неправильно. Загаданное число больше.");
                } else {
                    System.out.println("Неправильно. Загаданное число меньше.");
                }
            }

            System.out.println("К сожалению, вы не угадали. Загаданное число было: " + targetNumber);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}