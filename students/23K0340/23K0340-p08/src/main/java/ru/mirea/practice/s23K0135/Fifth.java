package ru.mirea.practice.s23K0135;

public abstract class Fifth {
    public static int rec(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return n % 10 + rec(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(rec(210));
    }
}
