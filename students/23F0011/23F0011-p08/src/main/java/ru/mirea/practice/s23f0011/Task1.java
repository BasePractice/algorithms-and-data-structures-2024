package ru.mirea.practice.s23f0011;

public abstract class Task1 {
    public static void triangularSequence(int n) {
        int count = 0;
        int curr = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(curr + " ");
            count++;
            if (count == curr) {
                curr++;
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n = 25;
        triangularSequence(n);
    }
}