package ru.mirea.practice.s23L0908.task3;

import java.util.Scanner;

public abstract class Main {

    public static void countOnes() {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            int previous = -1;

            while (true) {
                int current = scanner.nextInt();

                if (current == 0 && previous == 0) {
                    break;
                }

                if (current == 1) {
                    count++;
                }

                previous = current;
            }

            System.out.println("Количество единиц: " + count);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность натуральных чисел (двойные нули для завершения):");
        countOnes();
    }
}
