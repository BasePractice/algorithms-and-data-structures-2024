package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

abstract class Regex {
    public static void main(String[] args) {
        String validString = "abcdefghijklmnopqrstuv18340";
        String invalidString1 = "abcdefghijklmnoasdfasdpqrstuv183401";
        String invalidString2 = "abcdefghijklmnopqrstuv18340 ";

        System.out.println("Проверка строки: " + validString);
        System.out.println("Результат: " + isValidString(validString)); // true

        System.out.println("Проверка строки: " + invalidString1);
        System.out.println("Результат: " + isValidString(invalidString1)); //false

        System.out.println("Проверка строки: " + invalidString2);
        System.out.println("Результат: " + isValidString(invalidString2)); //false
    }

    public static boolean isValidString(String str) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        return Pattern.matches(regex, str);
    }
}