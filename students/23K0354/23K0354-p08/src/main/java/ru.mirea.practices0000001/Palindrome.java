package ru.mirea.practices0000001;

import java.util.Scanner;

public abstract class Palindrome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите слово: ");
            String word = scanner.nextLine();

            if (isPalindrome(word)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
