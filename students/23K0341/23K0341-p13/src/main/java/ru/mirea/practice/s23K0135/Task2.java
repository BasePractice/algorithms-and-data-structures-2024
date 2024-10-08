package ru.mirea.practice.s23K0135;

public abstract class Task2 {
    public static void main(String[] args) {
        lastChar("Hello!");
        lastChar("Hello there.");
    }

    static void lastChar(String arg) {
        System.out.println(arg.charAt(arg.length() - 1));
    }
}
