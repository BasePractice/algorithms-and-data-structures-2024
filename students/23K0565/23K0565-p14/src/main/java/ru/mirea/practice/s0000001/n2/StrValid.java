package ru.mirea.practice.s0000001.n2;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class StrValid {

    private StrValid() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Используем try-with-resources для автоматического закрытия
            System.out.println("Введите строку для проверки:");
            String input = scanner.nextLine();

            String regex = "^abcdefghijklmnopqrstuv18340$";
            Pattern pattern = Pattern.compile(regex);

            boolean isValid = pattern.matcher(input).matches();

            if (isValid) {
                System.out.println("Строка соответствует шаблону.");
            } else {
                System.out.println("Строка не соответствует шаблону.");
            }
        }
    }
}
