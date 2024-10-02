package ru.mirea.practice.s23f0011;

public abstract class Task6 {
    public static void main(String[] args) {
        System.out.println("Задание 6");
        for (int n = 1; n <= 10; n++) {
            String str = String.format("при n = %d -> %.3f", n, 1. / n);
            System.out.println(str);
        }
    }
}
