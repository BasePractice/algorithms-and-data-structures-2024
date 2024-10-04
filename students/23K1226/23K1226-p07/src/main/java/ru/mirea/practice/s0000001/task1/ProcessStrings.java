package ru.mirea.practice.s0000001.task1;

class ProcessStrings implements StringCalculable {
    public int countChars(String s) {
        return s.length();
    }

    public String oddPositionChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
