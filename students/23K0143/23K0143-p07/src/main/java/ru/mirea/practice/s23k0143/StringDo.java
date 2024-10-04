package ru.mirea.practice.s23k0143;

public class StringDo implements StringInterface {
    @Override
    public int cnt(String s) {
        return s.length();
    }

    @Override
    public String oddCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String invertString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
