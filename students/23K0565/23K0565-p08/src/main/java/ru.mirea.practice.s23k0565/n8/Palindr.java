package ru.mirea.practice.s23k0565.n8;

import java.util.Scanner;

public final class Palindr {

    private Palindr() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.next();
            if (isPalindrome(word, 0, word.length() - 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
}