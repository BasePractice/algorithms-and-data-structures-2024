package ru.mirea.practice.s0000001;

public class StringManipulatorImpl implements StringManipulator {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        // Индексы нечетных позиций
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) { // Нечетные позиции
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