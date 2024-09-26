package ru.mirea.practice.s23k0120.task8.reverse;


import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        StringBuilder str;


        try (Scanner sc = new Scanner(System.in)) {
            str = new StringBuilder(sc.nextLine());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        char c;
        for (int i = 0; i < str.length() / 2; i++) {
            c = str.charAt(i);
            str.setCharAt(i, str.charAt(str.length() - 1 - i));
            str.setCharAt(str.length() - 1 - i, c);
        }
        System.out.println(str);
    }
}
