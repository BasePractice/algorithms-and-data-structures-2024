package ru.mirea.practice.s23k0087.mathrandom;

public abstract class Task3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        boolean isIncreasing = true;

        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
            System.out.print(array[i] + " ");
            if (i > 0 && array[i] <= array[i - 1]) {
                isIncreasing = false;
            }
        }
        System.out.println();

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
