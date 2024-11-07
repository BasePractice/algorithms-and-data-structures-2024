package ru.mirea.practice.s0000001.task1.task1;

public class StringOpsImpl implements StringOps {

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
    public String reverseStr(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}