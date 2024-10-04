package ru.mirea.practice.s25k0112.task5;

public class ProcessString implements StringManipulator {
    public int countCharacters(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    public String getOddPositionCharacters(String s) {
        if (s == null) {
            return "";
        }

        StringBuilder oddChars = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            oddChars.append(s.charAt(i));
        }
        return oddChars.toString();
    }

    public String invertString(String s) {
        if (s == null) {
            return "";
        }

        StringBuilder invertedString = new StringBuilder(s).reverse();
        return invertedString.toString();
    }
}
