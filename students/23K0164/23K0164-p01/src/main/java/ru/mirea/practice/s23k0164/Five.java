package ru.mirea.practice.s23k0164;

public final class Five {

    private Five() {

    }

    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}