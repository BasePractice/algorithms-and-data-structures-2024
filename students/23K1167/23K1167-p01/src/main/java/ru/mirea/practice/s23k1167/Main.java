package ru.mirea.practice.s23k1167;

public abstract class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};


        int totalSum = 0;


        for (int num : numbers) {
            totalSum += num;
        }


        double average = (double) totalSum / numbers.length;


        System.out.println(+ totalSum);
        System.out.println(+ average);
    }
}