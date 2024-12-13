package ru.mirea.practice.s23k0350;

abstract class MainArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] invertedArray = ArrayInverter.invertArray(originalArray);
        for (int num : invertedArray) {
            System.out.print(num + " ");
        }
    }
}
