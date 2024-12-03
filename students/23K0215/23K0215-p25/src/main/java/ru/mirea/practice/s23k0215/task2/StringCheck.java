package ru.mirea.practice.s23k0215.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringCheck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Введите строку для проверки:");

            String input = scanner.nextLine();

            String regex = "^abcdefghijklmnopqrstuv18340$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                System.out.println("Строка совпадает с 'abcdefghijklmnopqrstuv18340'");
            } else {
                System.out.println("Строка не совпадает с 'abcdefghijklmnopqrstuv18340'");
            }
        }
    }
}
