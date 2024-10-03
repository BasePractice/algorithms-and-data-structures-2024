package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите количество элементов массива: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            System.out.println("Введите элементы массива all:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int sum = 0;
            double avg;

            for (int num : nums) {
                sum += num;
            }

            avg = (double) sum / nums.length;

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Среднее арифметическое элементов массива: " + avg);
        }
    }
}
