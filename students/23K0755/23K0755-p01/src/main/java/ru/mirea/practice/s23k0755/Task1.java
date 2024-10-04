package ru.mirea.practice.s23k0755;

public abstract class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            System.out.println("Аргумент №" + (i + 1) + ": " + args[i]);
        }
    }
}
