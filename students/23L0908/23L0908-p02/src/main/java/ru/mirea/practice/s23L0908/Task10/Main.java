package ru.mirea.practice.s23L0908.Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();
        scanner.close();
        if (input.trim().isEmpty()) {
            System.out.println("You entered 0 words.");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Number of words entered: " + words.length);
        }
    }
}
