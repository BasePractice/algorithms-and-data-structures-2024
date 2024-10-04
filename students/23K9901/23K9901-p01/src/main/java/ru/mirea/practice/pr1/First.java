package ru.mirea.practice.pr1;

public abstract class First {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 1, 8, 9};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Elements sum: " + sum);
        System.out.println("Average: " + average);
    }
}
