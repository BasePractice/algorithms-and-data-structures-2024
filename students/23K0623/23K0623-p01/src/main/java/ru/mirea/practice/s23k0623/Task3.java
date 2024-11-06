package ru.mirea.practice.s23k0623;

public final class Task3 {
    private Task3() {}

    public static void main(String[] args) {

        System.out.println("Аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}


