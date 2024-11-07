package ru.mirea.practice.s23k0169;

import java.util.Scanner;

public final class Ex3 {

    private Ex3() {

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int sum = 0;
            int[] myArray = new int[7];

            for (int i = 0; i < 7; i++) {
                myArray[i] = sc.nextInt();
            }
            for (int j : myArray) {
                sum += j;
            }
            System.out.println("Сумма элементов: " + sum);
            System.out.println("Среднее арифметическое: " + sum / myArray.length);
        }
    }
}
