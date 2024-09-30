package ru.mirea.practice3;

import java.util.Random;

public class  Third{

    public static void main(String[] args) {
        int[] numbers = new int[4];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
numbers[i] = 10 + random.nextInt(90);
        }

        System.out.print("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isIncreasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

