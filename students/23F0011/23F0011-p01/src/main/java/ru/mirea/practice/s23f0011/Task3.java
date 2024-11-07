package ru.mirea.practice.s23f0011;

public abstract class Task3 {
    public static void main(String[] args) {
        System.out.println("Задание 3");
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 10};
        int sum = 0;
        int avg = 0;
        for (int j : arr) {
            sum += j;
        }
        avg = sum / arr.length;
        System.out.println("Сумма элементов целочисленного массива:" + sum);
        System.out.println("Среднее арифметическое массива:" + avg);
    }
}
