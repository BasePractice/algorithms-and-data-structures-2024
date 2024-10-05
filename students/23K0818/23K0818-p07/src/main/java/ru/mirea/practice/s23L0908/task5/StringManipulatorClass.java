package ru.mirea.practice.s23L0908.task5;

public class StringManipulatorClass implements StringManipulator {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
