package ru.mirea.practice.s23f0011.task5andtask6;

public class ProcessStrings implements StringProcessorable {

    public int countCharacters(String s) {
        return s.length();
    }

    public String oddPositions(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
