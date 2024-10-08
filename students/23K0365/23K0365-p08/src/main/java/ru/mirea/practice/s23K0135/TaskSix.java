package ru.mirea.practice.s23K0135;

public abstract class TaskSix {
    public static boolean delSmth(int n, int del) {
        if (n < 2 || n % del == 0) {
            return false;
        }
        if (del * del > n) {
            return true;
        }
        return delSmth(n, del + 1);
    }

    public static void main(String[] args) {
        if (delSmth(23, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO!");
        }
    }
}
