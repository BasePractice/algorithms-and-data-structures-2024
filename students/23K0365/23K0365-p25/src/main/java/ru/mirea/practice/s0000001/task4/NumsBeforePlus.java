package ru.mirea.practice.s0000001.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class NumsBeforePlus {
    public static void main(String[] args) {
        String regex = "\\d+\\s\\+";
        String[] opera = {
            "2 + 7",
            "(2 + 7) / (98 * 15)",
            "6 / 5 – 2 * 9",
            "1 +",
            "1 + 2  / 3",
            "+ 1"
        };
        Pattern p1 = Pattern.compile(regex);
        Matcher m1;
        for (String x : opera) {
            m1 = p1.matcher(x);
            if (m1.find()) {
                System.out.println(x + "\t: в тексте ЕСТЬ такие цифры после которых стоит знак +");
            } else {
                System.out.println(x + "\t: в тексте НЕТ таких цифр после которых стоит знак +");
            }
        }
    }
}
