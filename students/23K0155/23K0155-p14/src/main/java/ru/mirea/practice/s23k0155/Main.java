package ru.mirea.practice.s23k0155;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите патерн для разделение строк:");
            String stringPattern = scanner.next();
            Pattern pattern = Pattern.compile(stringPattern);
            String[] string = pattern.split(scanner.next());
            for (String word : string) {
                System.out.println(word);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}