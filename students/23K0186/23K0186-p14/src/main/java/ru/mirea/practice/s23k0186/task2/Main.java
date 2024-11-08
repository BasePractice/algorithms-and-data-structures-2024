package ru.mirea.practice.s23k0089.task2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");

            System.out.print("Введите выражение: ");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean res = matcher.matches();
            if (res) {
                System.out.println("Выражение совпало");
            } else {
                System.out.print("Выражение отличается");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
