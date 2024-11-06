package ru.mirea.practice.s0000001.task1;

public abstract class Task1 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int k = 1; count < n; k++) {
            for (int j = 0; j < k && count < n; j++) {
                System.out.print(k + " ");
                count++;
            }
        }
    }
}
