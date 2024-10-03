package ru.mirea.practice.s0000002;

public abstract class Third {
    public static void main(String[] args) {
        double a = 0.0;
        for (double i = 1.0;i < 11;i += 1.0) {
            a = 1.0 / i;
            String s = String.format("%.2f",a);
            System.out.println(s);
        }
    }
}
