package ru.mirea.practice.s23f0011;

import static ru.mirea.practice.s23f0011.LexicographicalPermutations.printPermutation;
import static ru.mirea.practice.s23f0011.LexicographicalPermutations.nextPermutation;

public abstract class Tester {
    public static void main(String[] args) {
        int n = 4;  // Размер последовательности (числа от 1 до N)
        int[] arr = new int[n];

        // Заполняем массив числами от 1 до N
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        // Печатаем все перестановки в лексикографическом порядке
        do {
            printPermutation(arr);
        } while (nextPermutation(arr));  // Генерируем следующую перестановку
    }
}

