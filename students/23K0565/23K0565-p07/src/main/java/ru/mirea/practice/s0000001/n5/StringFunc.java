package ru.mirea.practice.s0000001.n5;

public class StringFunc implements StringOperations {

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
        StringFunc func = new StringFunc();
        String example = "example";

        System.out.println("Количество символов: " + func.countChars(example));
        System.out.println("Символы на нечетных позициях: " + func.oddChars(example));
        System.out.println("Инвертированная строка: " + func.reverseString(example));
    }
}