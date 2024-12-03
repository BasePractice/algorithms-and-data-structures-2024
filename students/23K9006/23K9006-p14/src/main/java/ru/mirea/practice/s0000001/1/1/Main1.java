package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class Main1 {
    private Main1() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите пароль для проверки:");
            String input = scanner.nextLine();

            SecurePasswordValidator validator = new SecurePasswordValidator(input);
            boolean isValid = validator.isValid();

            if (isValid) {
                System.out.println("Пароль надежен: " + input);
            } else {
                System.out.println("Пароль ненадежен: " + input);
            }

        }
    }
}
