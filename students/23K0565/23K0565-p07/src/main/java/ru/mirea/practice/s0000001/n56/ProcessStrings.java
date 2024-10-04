package ru.mirea.practice.s0000001.n56;

import ru.mirea.practice.s0000001.n5.StringOperations;

public class ProcessStrings implements StringOperations {

    public int countChars(String s) {
        return s.length();
    }

    public String oddChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        ProcessStrings ps = new ProcessStrings();
        String testString = "process";

        System.out.println("Количество символов: " + ps.countChars(testString));
        System.out.println("Символы на нечетных позициях: " + ps.oddChars(testString));
        System.out.println("Инвертированная строка: " + ps.reverseString(testString));
    }
}