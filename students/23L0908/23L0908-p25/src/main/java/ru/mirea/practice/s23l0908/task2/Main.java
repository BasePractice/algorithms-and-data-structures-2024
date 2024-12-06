package ru.mirea.practice.s23l0908.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String text = "(1 + 8) – 9 / 4, 6 / 5 – 2 * 9";

        String regex = "\\b\\d+(?!\\s*\\+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false;
        System.out.println("Найдены цифры без знака '+':");
        while (matcher.find()) {
            System.out.println("Число: " + matcher.group() + ", позиция: " + matcher.start());
            found = true;
        }

        if (!found) {
            System.out.println("Все числа сопровождаются знаком '+'.");
        }
    }
}
