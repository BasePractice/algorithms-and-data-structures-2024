package ru.mirea.practice.s23k0140.task2;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Введите строку для проверки: ");
            String inputString = scanner.nextLine();

            String regex = "^abcdefghijklmnopqrstuv18340$";

            boolean isValid = Pattern.matches(regex, inputString);

            if (isValid) {
                System.out.println("Строка корректна.");
            } else {
                System.out.println("Строка некорректна.");
            }
        }
    }
}