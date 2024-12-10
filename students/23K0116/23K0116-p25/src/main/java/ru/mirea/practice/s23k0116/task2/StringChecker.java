package ru.mirea.practice.s23k0116.task2;

public abstract class StringChecker {
    // Регулярное выражение для проверки строки
    private static final String PATTERN = "^abcdefghijklmnopqrstuv18340$";

    // Метод для проверки строки
    public static boolean isValidString(String input) {
        return input.matches(PATTERN);
    }

    public static void main(String[] args) {
        // Примеры строк для проверки
        String validString = "abcdefghijklmnopqrstuv18340";
        String invalidString = "abcdefghijklmnoasdfasdpqrstuv18340";

        // Проверка строк
        System.out.println("Строка \"" + validString + "\" корректна: " + isValidString(validString));
        System.out.println("Строка \"" + invalidString + "\" корректна: " + isValidString(invalidString));
    }
}
