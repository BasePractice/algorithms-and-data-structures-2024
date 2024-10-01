package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Program1 {
    public void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int[] numbers = {1, 2, 3, 4, 5};

            int sum = 0;

            for (int num : numbers) {

                sum += num;

            }

            double average = (double) sum / numbers.length;

            System.out.println("Сумма: " + sum + ", Среднее: " + average);

        }
    }

}
