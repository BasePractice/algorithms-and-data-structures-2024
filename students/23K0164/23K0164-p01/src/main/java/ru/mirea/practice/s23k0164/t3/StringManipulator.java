package ru.mirea.practice.s23k0164.t3;

public class StringManipulator implements StringOperations {
    @Override
    public int countCharacters(String s) {
        if (s == null) {
            return 0;
        }
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s){
        if (s == null) {
            return "Строка пустая";
        }
        String oddChars = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                oddChars += s.charAt(i);
            }
        }
        return oddChars;
    }

    @Override
    public String reverseString(String s){
        if (s == null) {
            return "Строка пустая";
        }
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

}
