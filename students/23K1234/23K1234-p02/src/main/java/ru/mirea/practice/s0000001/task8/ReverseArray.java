package ru.mirea.practice.s0000001.task8;

import java.util.Scanner;

public abstract class ReverseArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = scanner.nextInt();
            scanner.nextLine();

            String[] array = new String[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextLine();
            }

            for (int i = 0; i < n / 2; i++) {
                String temp = array[i];
                array[i] = array[n - 1 - i];
                array[n - 1 - i] = temp;
            }

            System.out.println("Reversed array:");
            for (String element : array) {
                System.out.println(element);
            }
        }
    }
}
