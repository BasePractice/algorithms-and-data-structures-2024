package ru.mirea.practice.s0000007.task4;

public class StringManipulator implements StringOperations {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s) {
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) { // Нечетные позиции (1, 3, 5, ...)
                oddChars.append(s.charAt(i));
            }
        }
        return oddChars.toString();
    }

    @Override
    public String invertString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}