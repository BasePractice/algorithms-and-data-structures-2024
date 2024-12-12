package ru.mirea.practice.s0000001;

import static ru.mirea.practice.s0000001.ArrayInvert.reverseArray;

public final class TestInvert {
    private TestInvert() {

    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(originalArray);

        reverseArray(originalArray);

        System.out.println("Reversed Array:");
        printArray(originalArray);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
