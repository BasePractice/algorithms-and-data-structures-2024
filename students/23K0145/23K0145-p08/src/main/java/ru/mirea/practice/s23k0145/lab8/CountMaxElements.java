package ru.mirea.practice.s23k0145.lab8;

import java.util.Scanner;

public abstract class CountMaxElements {

    public static int countMax(int max, int count) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();

            if (num == 0) {
                return count; // Последовательность закончилась
            }

            if (num > max) {
                return countMax(num, 1); // Новое максимальное значение, сбрасываем счётчик
            } else if (num == max) {
                return countMax(max, count + 1); // Увеличиваем счётчик
            } else {
                return countMax(max, count); // Оставляем счётчик без изменений
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите числа последовательности (завершается 0):");
        int result = countMax(0, 0);
        System.out.println("Количество элементов, равных максимальному: " + result);
    }
}

