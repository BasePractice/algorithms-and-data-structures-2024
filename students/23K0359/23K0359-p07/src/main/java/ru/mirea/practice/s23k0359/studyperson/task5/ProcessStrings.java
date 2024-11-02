package ru.mirea.practice.s23k0359.studyperson.task5;

public class ProcessStrings implements Processable {

    public int counter(String string) {
        return string.length();
    }

    public String inverter(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }

    public String replacer(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < string.length(); i += 2) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }

}
