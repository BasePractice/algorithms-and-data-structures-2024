package ru.mirea.practice.task1.task1.task2;

public final class StringValidator {

    private StringValidator() {
        throw new UnsupportedOperationException("Утилитный класс не должен быть создан");
    }

    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String[] testStrings = {
            "abcdefghijklmnopqrstuv18340",
            "abcdefghijklmnoasdfasdpqrstuv18340"
        };

        for (String test : testStrings) {
            if (test.matches(regex)) {
                System.out.println(test + " - правильная строка.");
            } else {
                System.out.println(test + " - неправильная строка.");
            }
        }
    }
}
