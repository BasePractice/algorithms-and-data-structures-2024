package ru.mirea.practice.s23k0116.task2;

public abstract class Main {

    public static void findNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.print(current + " ");
        findNumbers(current + 1, n);
    }

    public static void main(String[] args) {
        findNumbers(1, 5);


    }
}