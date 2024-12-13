package ru.mirea.practice.s23k0135.task2;


import java.util.regex.Pattern;

public abstract class StringValidator {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        String[] testStrings = {
            "abcdefghijklmnopqrstuv18340", // правильная
            "abcdefghijklmnoasdfasdpqrstuv18340", // неправильная
            "abcdefghijklmnopqrstuv18340abc" // неправильная
        };

        for (String test : testStrings) {
            boolean matches = Pattern.matches(regex, test);
            System.out.println("Строка \"" + test + "\" " + (matches ? "соответствует" : "не соответствует") + " шаблону.");
        }
    }
}
