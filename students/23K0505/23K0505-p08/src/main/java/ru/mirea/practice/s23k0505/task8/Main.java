package ru.mirea.practice.s23k0505.task8;

public abstract class Main {
    public static boolean isPalindrome(String word, int currCh) {
        if (currCh == word.length() / 2) {
            return true;
        } else if (word.charAt(currCh) == word.charAt(word.length() - currCh - 1)) {
            return isPalindrome(word, currCh + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("rotator", 0));
        System.out.println(isPalindrome("computer", 0));
        System.out.println(isPalindrome("racecar", 0));
        System.out.println(isPalindrome("шалаш", 0));
        System.out.println(isPalindrome("самолёт", 0));
    }
}
