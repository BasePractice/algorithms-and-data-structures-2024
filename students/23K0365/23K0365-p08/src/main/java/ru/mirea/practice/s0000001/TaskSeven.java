package ru.mirea.practice.s0000001;

public abstract class TaskSeven {
    public static void delSmth(int n, int del) {
        if (del * del < n) {
            if (n % del == 0) {
                System.out.print(del + "\t");
                System.out.print(n / del + "\n");
            }
            delSmth(n, del + 1);
        }
    }

    public static void main(String[] args) {
        delSmth(32, 1);
    }
}
