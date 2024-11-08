package ru.mirea.practice.s0000001.n1;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Str {

    private Str() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для разбивки на элементы:");
            String input = scanner.nextLine();

            String regex = "\\s+|,\\s*|\\.\\s*";
            Pattern pattern = Pattern.compile(regex);

            String[] elements = pattern.split(input);

            System.out.println("Результат разбивки строки:");
            for (String element : elements) {
                if (!element.isEmpty()) {
                    System.out.println(element);
                }
            }
        }
    }
}
