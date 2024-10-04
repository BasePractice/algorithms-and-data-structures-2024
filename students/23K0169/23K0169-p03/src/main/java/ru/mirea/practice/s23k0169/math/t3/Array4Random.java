package ru.mirea.practice.s23k0169.math.t3;

import java.util.Random;

public final class Array4Random {

    private  Array4Random() {

    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }

        System.out.print("Сгенерированный массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        boolean isStrictlyIncreasing = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
