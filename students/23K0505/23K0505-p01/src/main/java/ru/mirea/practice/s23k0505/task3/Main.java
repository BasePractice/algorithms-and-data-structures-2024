package ru.mirea.practice.s23k0505.task3;

public abstract class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = (int)(Math.random() * 21 - 10);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.printf("\nСумма = %d", sum);
        System.out.printf("\nСреднее арифметическое = %.1f", (double) sum / 5);
    }
}