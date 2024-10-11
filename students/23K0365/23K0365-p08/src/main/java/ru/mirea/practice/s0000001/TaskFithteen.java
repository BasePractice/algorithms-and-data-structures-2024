package ru.mirea.practice.s0000001;

public abstract class TaskFithteen {
    public static void rightToLeft(int n) {
        if (n != 0) {
            int temp = n % 10;
            System.out.print(temp + " ");
            rightToLeft(n / 10);
        }
    }

    public static void main(String[] args) {
        rightToLeft(987654321);
    }
}
