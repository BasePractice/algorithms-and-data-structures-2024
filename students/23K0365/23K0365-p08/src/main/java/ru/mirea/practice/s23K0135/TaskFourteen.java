package ru.mirea.practice.s23K0135;

public abstract class TaskFourteen {
    public static void leftToRight(int n) {
        if (n != 0) {
            int temp = n % 10;
            leftToRight(n / 10);
            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {
        leftToRight(987654321);
    }
}
