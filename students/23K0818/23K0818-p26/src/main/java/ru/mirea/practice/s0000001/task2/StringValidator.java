package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class StringValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку для проверки: ");
            String inputString = scanner.nextLine();

            String regex = "^abcdefghijklmnopqrstuv18340$";

            boolean isValid = Pattern.matches(regex, inputString);

            if (isValid) {
                System.out.println("Строка корректна.");
            } else {
                System.out.println("Строка некорректна.");
            }

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
