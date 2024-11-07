package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

public final class Main {

    private Main() {
        // 123
    }

    public static void splitString(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        String[] parts = pattern.split(input);
        System.out.println("Строка до разбивки: " + input);
        System.out.println("Результат разбивки строки:");
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public static boolean isValidString(String input) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        return Pattern.matches(regex, input);
    }

    public static void main(String[] args) {
        String inputString = "Hello,123World,456Example";
        String regex = "\\d+"; // \\d+ значит, что строка будет разбита стоящими в ней числами
        splitString(inputString, regex);

        String testString1 = "abcdefghijklmnopqrstuv18340";
        String testString2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        System.out.println("Проверка строки: " + testString1 + " - "
            + (isValidString(testString1) ? "Соответствует" : "Не соответствует"));
        System.out.println("Проверка строки: " + testString2 + " - "
            + (isValidString(testString2) ? "Соответствует" : "Не соответствует"));
    }
}
