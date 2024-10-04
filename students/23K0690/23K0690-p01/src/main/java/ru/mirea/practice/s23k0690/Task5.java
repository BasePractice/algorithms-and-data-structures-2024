package ru.mirea.practice.s23k0690;

public final class Task5 {

    private Task5() {
    }

    public static void main(String[] arguments) {
        if (arguments.length == 0) {
            System.out.println("Нет переданных аргументов.");
            return;
        }

        for (int i = 0; i < arguments.length; i++) {
            System.out.println("Аргумент " + i + ": " + arguments[i]);
        }
    }
}