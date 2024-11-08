package ru.mirea.practice.s23k0375.task2;

import java.util.regex.Pattern;

public abstract class StrValidation {

    public static void main(String[] args) {
        String targetString = "abcdefghijklmnopqrstuv18340";
        String regex = "^abcdefghijklmnopqrstuv18340$";

        // Проверка на соответствие регулярному выражению
        boolean isValid = Pattern.matches(regex, targetString);

        System.out.println("Строка '" + targetString + "' соответствует регулярному выражению: " + isValid);

        // Примеры для проверки
        String validExample = "abcdefghijklmnopqrstuv18340";
        String invalidExample1 = "abcdefghijklmnoasdfasdpqrstuv18340";
        String invalidExample2 = "abcdefghijklmnopqrstuv183401";

        System.out.println("Строка '" + validExample + "' соответствует регулярному выражению: " + Pattern.matches(regex, validExample));
        System.out.println("Строка '" + invalidExample1 + "' соответствует регулярному выражению: " + Pattern.matches(regex, invalidExample1));
        System.out.println("Строка '" + invalidExample2 + "' соответствует регулярному выражению: " + Pattern.matches(regex, invalidExample2));
    }
}
