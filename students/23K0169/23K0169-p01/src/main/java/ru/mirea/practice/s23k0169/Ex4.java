package ru.mirea.practice.s23k0169;

import java.util.Scanner;

public final class Ex4 {

    private Ex4() {

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int sum = 0;
            int[] myArray = new int[6];
            int i = 0;
            int max = 0;
            int min = 10000;

            while (i < 6) {
                myArray[i] = sc.nextInt();
                if (myArray[i] > max) {
                    max = myArray[i];
                }
                if (myArray[i] < min) {
                    min = myArray[i];
                }
                sum += myArray[i];
                i++;
            }
            System.out.println("Сумма всех элементов: " + sum);
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);
        }
    }
}

