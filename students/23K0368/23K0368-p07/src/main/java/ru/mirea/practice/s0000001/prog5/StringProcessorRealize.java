package ru.mirea.practice.s0000001.prog5;

public class StringProcessorRealize implements StringProcessor {

    @Override
    public int countSymbols(String s) {
        return s.length();
    }

    @Override
    public String getOddSymbols(String s) {
        StringBuilder oddSymbols = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            oddSymbols.append(s.charAt(i));
        }
        return oddSymbols.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
