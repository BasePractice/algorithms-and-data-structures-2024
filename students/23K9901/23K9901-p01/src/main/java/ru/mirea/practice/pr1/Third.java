package ru.mirea.practice.pr1;

public abstract class Third {
    public static void main(String[] args) {
        int[] numbers = {8, 2, 9, 6, 7};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }


        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}

