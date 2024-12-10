package ru.mirea.practice.s0000001.n6;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class EValid {

    private EValid() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите e-mail для проверки:");
            String input = scanner.nextLine();

            String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            Pattern pattern = Pattern.compile(regex);

            boolean isValid = pattern.matcher(input).matches();

            if (isValid) {
                System.out.println("E-mail адрес корректный");
            } else {
                System.out.println("E-mail адрес некорректный");
            }
        }
    }
}
