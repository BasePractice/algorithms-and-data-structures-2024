package ru.mirea.practice.s0000001;

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
