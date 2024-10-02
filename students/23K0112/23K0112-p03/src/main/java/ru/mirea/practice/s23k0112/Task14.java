package ru.mirea.practice.s23k0112;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public final class Task14 {
    private Task14() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random rand = new Random();

            System.out.println("Write down n: ");
            int n = scanner.nextInt();
            while (n < 0) {
                System.out.println("Wrong n! Write down n: ");
                n = scanner.nextInt();
            }

            int[] arr = new int[n];
            int[] arrEven = new int[0];
            int iEven = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(n + 1);
                if (arr[i] % 2 == 0) {
                    arrEven = Arrays.copyOf(arrEven, arrEven.length + 1);
                    arrEven[iEven] = arr[i];
                    iEven++;
                }
            }

            System.out.println("Array: " + Arrays.toString(arr));
            if (arr.length != 0) {
                System.out.println("Even numbers: " + Arrays.toString(arrEven));
            }
        }
    }
}