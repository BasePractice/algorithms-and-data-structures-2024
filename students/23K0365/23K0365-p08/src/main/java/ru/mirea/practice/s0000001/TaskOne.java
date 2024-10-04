package ru.mirea.practice.s0000001;

public abstract class TaskOne {
    public static void printerN(int cur, int n) {
        if (n != 0) {
            for (int i = 0; i < cur && n > 0; i++) {
                System.out.println(cur);
                n--;
            }
            printerN(cur + 1, n);
        }
    }

    public static void main(String[] args) {
        printerN(1,10);
    }
}
