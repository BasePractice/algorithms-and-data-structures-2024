package ru.mirea.practice.s0000001.task5and6;

public class ProcessStringOpp implements ProcessString {
    @Override
    public int countOfElements(String x) {
        return x.length();
    }

    @Override
    public String notOddString(String x) {
        String res = "";
        for (int i = 1; i < x.length(); i += 2) {
            res += x.charAt(i);
        }
        return res;
    }

    @Override
    public String invertedString(String x) {
        String res = "";
        for (int i = x.length() - 1; i > 0; i--) {
            res += x.charAt(i);
        }
        return res;
    }
}
