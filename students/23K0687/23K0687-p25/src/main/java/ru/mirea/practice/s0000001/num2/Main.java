package ru.mirea.practice.s0000001.num2;

import java.util.regex.Pattern;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }

    public static void main(String[] args) {
        String regex = "^[a-z]{24}18340$";
        String input = "abcdefghijklmnopqrstuv18340";

        if (Pattern.matches(regex, input)) {
            System.out.println("Строка корректна");
        } else {
            System.out.println("Строка некорректна");
        }
    }
}
