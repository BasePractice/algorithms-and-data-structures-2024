package ru.mirea.practice.s23k0087.task5;

public class StringProcessor implements StringProcessing {
    @Override
    public int countCharacters(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    @Override
    public String oddPositions(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        StringBuilder oddChars = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            oddChars.append(s.charAt(i));
        }
        return oddChars.toString();
    }

    @Override
    public String reverseString(String s) {
        if (s == null) {
            return "";
        }
        return new StringBuilder(s).reverse().toString();
    }
}
