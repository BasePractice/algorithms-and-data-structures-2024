package ru.mirea.practice.s23k0755.task5and6;

public class ProcessString implements StringProcessable {

    public int countChars(String string, char ch) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public String oddPlaces(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < string.length(); i += 2) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }

    public String invert(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }
}
