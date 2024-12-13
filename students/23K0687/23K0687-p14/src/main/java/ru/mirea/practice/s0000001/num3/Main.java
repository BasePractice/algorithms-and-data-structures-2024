package ru.mirea.practice.s0000001.num3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        String text = "6 / 5 – 2 * 9, (1 + 8) – 9 / 4";
        Pattern p = Pattern.compile("\\d+(?!\\s*\\+)");
        Matcher m = p.matcher(text);
        if (m.find()) {
            System.out.println("Найдены цифры без знака '+'.");
        } else {
            System.out.println("Все цифры имеют знак '+'.");
        }
    }
}
