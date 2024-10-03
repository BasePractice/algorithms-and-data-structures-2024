package ru.mirea.practice.s0000002.task10;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a sentence:");
            String input = scanner.nextLine();

            String[] words = input.trim().split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
    }
}

