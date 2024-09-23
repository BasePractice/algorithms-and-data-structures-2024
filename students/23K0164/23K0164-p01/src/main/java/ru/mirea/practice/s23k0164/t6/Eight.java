package ru.mirea.practice.s23k0164.t6;

import java.util.Scanner;

public final class Eight {
    private Eight(){

    }


    private static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }

    public static void main(String[] args) {
        boolean count;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число слово:");
            String s = scanner.nextLine();
            count = isPalindrome(s);
            if (!count){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}
