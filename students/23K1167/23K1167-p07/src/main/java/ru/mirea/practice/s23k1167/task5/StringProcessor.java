package ru.mirea.practice.s23k1167.task5;

class StringProcessor implements StringOperations {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddIndexedCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 != 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}
