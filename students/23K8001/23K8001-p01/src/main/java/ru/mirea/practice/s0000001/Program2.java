package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Program2 {
    public void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите размер массива: ");

            int size = scanner.nextInt();

            int[] userNumbers = new int[size];


            for (int i = 0; i < size; i++) {

                System.out.print("Введите элемент " + (i + 1) + ": ");

                userNumbers[i] = scanner.nextInt();

            }
            int min = userNumbers[0];

            int max = userNumbers[0];

            int sum = 0;
            int index = 0;

            do {

                sum += userNumbers[index];

                if (userNumbers[index] < min) {
                    min = userNumbers[index];
                }

                if (userNumbers[index] > max) {
                    max = userNumbers[index];
                }

                index++;

            } while (index < size);

            System.out.println("Сумма: " + sum + ", Минимум: " + min + ", Максимум: " + max);
        }
    }
}
