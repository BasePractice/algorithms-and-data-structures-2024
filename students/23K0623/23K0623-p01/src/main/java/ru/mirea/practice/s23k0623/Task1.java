package ru.mirea.practice.s23k0623;

public final class Task1 {
    private Task1() {}


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}