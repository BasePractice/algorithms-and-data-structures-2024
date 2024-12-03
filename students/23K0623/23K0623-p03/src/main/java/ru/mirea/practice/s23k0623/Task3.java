package ru.mirea.practice.s23k0623;

import java.util.Random;

public final class Task3 {

    private Task3() {
        // Тут всё ещё пусто
    }

    public static void main(String[] args) {

        int[] arr = new int[4];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + random.nextInt(90);
        }

        System.out.print("Массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив возрастающий.");
        } else {
            System.out.println("Массив не возрастающий.");
        }
    }
}