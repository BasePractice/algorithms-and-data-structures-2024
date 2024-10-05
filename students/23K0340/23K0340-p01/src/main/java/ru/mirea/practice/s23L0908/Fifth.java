package ru.mirea.practice.s23L0908;

public abstract class Fifth {

    public static int fact(int a) {
        int f = 1;
        for (int i = a;i > 0;i--) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        int s = fact(5);
        System.out.println(s);
    }
}
