package ru.mirea.practice.s23k0755.task5and6;

public abstract class Main {
    public static void main(String[] args) {
        StringProcessable processer = new ProcessString();
        String s = "Hello, world!";
        System.out.println(processer.countChars(s, 'o'));
        System.out.println(processer.oddPlaces(s));
        System.out.println(processer.invert(s));
    }
}
