package ru.mirea.practice.s23k0690.task56;

public class Task56process implements Task5proces {
    public int con(String s) {
        return s.length();
    }

    public String add(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
