package ru.mirea.practice.s23k0145.lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public abstract class NumericValidator {
    public static void main(String[] args) {
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Введите строку для проверки наличия некорректных чисел:");
            String inputText = userInput.nextLine();

            boolean containsInvalidNumbers = hasIncorrectNumbers(inputText);

            if (containsInvalidNumbers) {
                System.out.println("Обнаружены числа, за которыми отсутствует знак '+'.");
            } else {
                System.out.println("Все числа правильно сопровождаются знаком '+'.");
            }
        }
    }

    public static boolean hasIncorrectNumbers(String input) {
        String patternExpression = "\\b\\d+\\b(?!\\s*\\+)";
        Pattern compiledPattern = Pattern.compile(patternExpression);
        Matcher textMatcher = compiledPattern.matcher(input);

        return textMatcher.find();
    }
}

