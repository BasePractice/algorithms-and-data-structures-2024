package ru.mirea.practice.s0000001;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task3 {
    public static void main(String[] args) {
        System.out.println("Extracts first match only!");

        final Pattern p = Pattern.compile("(\\d+\\.\\d\\d ((USD)|(RUB)|(EU)))");

        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            Matcher m = p.matcher(str);
            if (m.find()) {
                System.out.println(m.group(1));
            } else {
                System.out.println("Nothing was matched.");
            }
        }
    }
}
