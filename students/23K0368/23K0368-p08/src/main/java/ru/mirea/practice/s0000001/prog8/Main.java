package ru.mirea.practice.s0000001.prog8;

import java.util.Scanner;

public abstract class Main {
    public static void polinom(String word) {
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        if (builder.toString().equals(word)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Write you word");
            String word = scanner.nextLine();
            polinom(word);
        }
    }
}
