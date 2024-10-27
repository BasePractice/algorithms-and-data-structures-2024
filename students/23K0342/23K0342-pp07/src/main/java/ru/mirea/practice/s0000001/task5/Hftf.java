package ru.mirea.practice.s0000001.task5;

public interface Hftf {

    static int len(String text) {
        return text.length();
    }

    static String unevens(String text) {
        String str = "";
        for (int i = 0;i < text.length(); i += 2) {
            str += text.charAt(i);
        }
        return str;
    }

    static String invert(String text) {
        String str = "";
        for (int c = text.length() - 1;c >= 0;c--) {
            str += text.charAt(c);
        }
        return str;
    }
}
