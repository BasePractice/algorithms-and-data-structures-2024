package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class Main3 {
    private Main3() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для проверки:");
            String input = scanner.nextLine();

            ExactStringValidator validator = new ExactStringValidator(input);
            boolean isValid = validator.isValid();

            if (isValid) {
                System.out.println("Строка корректна: " + input);
            } else {
                System.out.println("Строка некорректна: " + input);
            }

        }
    }
}
