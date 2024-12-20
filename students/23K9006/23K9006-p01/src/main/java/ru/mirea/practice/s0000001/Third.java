package ru.mirea.practice.s0000001;

public abstract class Third {
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

