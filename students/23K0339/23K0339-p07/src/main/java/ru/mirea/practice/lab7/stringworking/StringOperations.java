package ru.mirea.practice.lab7.stringworking;

public class StringOperations implements StringWorking {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String getOddChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}

