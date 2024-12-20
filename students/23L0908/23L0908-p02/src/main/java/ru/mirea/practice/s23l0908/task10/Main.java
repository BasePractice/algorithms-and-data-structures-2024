package ru.mirea.practice.s23l0908.task10;

import java.util.Scanner;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Sử dụng try-with-resources để tự động đóng tài nguyên
            System.out.println("Enter a line of text:");
            String input = scanner.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("You entered 0 words.");
            } else {
                String[] words = input.trim().split("\\s+");
                System.out.println("Number of words entered: " + words.length);
            }
        }
    }
}



