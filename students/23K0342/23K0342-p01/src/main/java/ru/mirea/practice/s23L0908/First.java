package ru.mirea.practice.s23L0908;

public abstract class First {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        double average = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            average = sum / (i + 1);
        }

        System.out.println("Сумма элементов массива: " + sum);
        System.out.printf("Среднее арифметическое: %.2f", average);
    }
}
