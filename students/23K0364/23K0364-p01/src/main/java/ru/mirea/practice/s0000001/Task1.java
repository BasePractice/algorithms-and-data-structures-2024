package ru.mirea.practice.s0000001;

import java.util.Arrays;

public abstract class Task1 {

    public static void main(String[] args) {
        int[] x = {10, 45, 49, 234, 63, 92};
        int sum = Arrays.stream(x).sum();
        double ar = (double) sum / x.length;

        System.out.println("Сумма " + sum);
        System.out.println("Среднее арифметическое " + ar);
    }
}

