package ru.mirea.practice.s0000001;

import java.util.Formatter;

public abstract class Test {
    public static void main(String[] args) {
        double x = 1000.0 / 3.0;
        System.out.println("Строка без форматирования: " + x);
        try (Formatter formatter = new Formatter()) {
            formatter.format("Строка c форматированием: %.2f%n", x);
            formatter.format("Строка c форматированием: %8.2f%n", x);
            formatter.format("Строка c форматированием: %16.2f%n", x);
            System.out.println(formatter);
        }
    }
}