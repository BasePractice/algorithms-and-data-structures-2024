package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public abstract class StringManipulation {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Открытие и автоматическое закрытие сканнера
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            // Пример задачи 2
            String regex = "abcdefghijklmnopqrstuv18340";
            boolean matches = input.matches(regex);
            System.out.println("Does the string match 'abcdefghijklmnopqrstuv18340'? " + matches);

            // Пример задачи 3
            System.out.println("Prices (USD, RUR, EU):");
            String priceText = "25.98 USD, 30.12 EUR, 40.00 RUR";
            Pattern pricePattern = Pattern.compile("\\d+\\.\\d+ (USD|RUR|EUR)");
            Matcher priceMatcher = pricePattern.matcher(priceText);
            while (priceMatcher.find()) {
                System.out.println(priceMatcher.group());
            }

            // Пример задачи 4
            String expression = "(1 + 8) – 9 / 4";
            boolean expressionMatch = expression.matches("\\(\\d+ \\+ \\d+\\) – \\d+ / \\d+");
            System.out.println("Valid expression: " + expressionMatch);

            // Пример задачи 5
            String date = "29/02/2000";
            String dateRegex = "(19|20)\\d\\d/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])";
            boolean isValidDate = date.matches(dateRegex);
            System.out.println("Valid date: " + isValidDate);

            // Пример задачи 6
            String email = "user@example.com";
            String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            boolean isValidEmail = email.matches(emailRegex);
            System.out.println("Valid email: " + isValidEmail);

            // Пример задачи 7
            String password = "F032_Password";
            String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
            boolean isValidPassword = password.matches(passwordRegex);
            System.out.println("Valid password: " + isValidPassword);
        } catch (Exception e) {
            e.printStackTrace(); // Обработка ошибок при работе с ресурсами
        }
    }
}


