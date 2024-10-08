package ru.mirea.practice.s23K0135;

import java.util.Random;

public abstract class MathRandom {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rand = new Random();

        System.out.print("Полученный массив чисел в диапазоне от 10 до 99: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) + 10;
            System.out.print(array[i] + " ");
        }

        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("\nМассив является строго возврастающей последовательностью.");
        } else {
            System.out.println("\nМассив не является строго возврастающей последовательностью.");
        }
    }

}

