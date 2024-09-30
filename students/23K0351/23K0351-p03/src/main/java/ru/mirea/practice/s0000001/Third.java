package ru.mirea.practice.s0000001;

import java.util.Random;

public abstract class Third {
    public static void main(String[] args) {
        int size = 4;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(90) + 10;
            System.out.printf("%d ", array[i]);
        }

        System.out.println();

        boolean isVoz = true;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                isVoz = false;
                break;
            }

        }
        if (isVoz) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
