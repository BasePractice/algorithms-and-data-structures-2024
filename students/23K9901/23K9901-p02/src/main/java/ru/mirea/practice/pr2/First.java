package ru.mirea.practice.pr2;

public abstract class First {
    public static void main(String[] args) {
        int[] numbers = {9, 5, 8, 5, 7};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Elements sum: " + sum);
        System.out.println("Average: " + average);
    }
}
