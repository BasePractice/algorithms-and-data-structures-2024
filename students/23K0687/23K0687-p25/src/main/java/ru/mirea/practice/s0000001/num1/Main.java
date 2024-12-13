package ru.mirea.practice.s0000001.num1;

import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            String input = sc.nextLine();

            System.out.println("Введите регулярное выражение для разделителя:");
            String regex = sc.nextLine();

            String[] parts = input.split(regex);

            System.out.println("Результат разделения:");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }

    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }
}
