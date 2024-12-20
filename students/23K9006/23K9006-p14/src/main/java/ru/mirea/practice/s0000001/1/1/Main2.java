package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class Main2 {
    private Main2() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите дату для проверки (формат dd/mm/yyyy):");
            String input = scanner.nextLine();

            DateFormatValidator validator = new DateFormatValidator(input);
            boolean isValid = validator.isValid();

            if (isValid) {
                System.out.println("Дата корректна: " + input);
            } else {
                System.out.println("Дата некорректна: " + input);
            }

        }
    }
}