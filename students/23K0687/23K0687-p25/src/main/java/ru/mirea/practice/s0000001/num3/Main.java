package ru.mirea.practice.s0000001.num3;

import java.util.regex.Pattern;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }

    public static void main(String[] args) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$";
        String input = "29/02/2000";

        if (Pattern.matches(regex, input)) {
            System.out.println("Дата корректна");
        } else {
            System.out.println("Дата некорректна");
        }
    }
}
