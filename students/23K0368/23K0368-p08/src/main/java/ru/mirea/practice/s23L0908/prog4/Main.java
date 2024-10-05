package ru.mirea.practice.s23L0908.prog4;

import java.util.Scanner;

public abstract class Main {

    public static int countNumbers(int k, int s) {
        if (k == 1 && s == 0) {
            return 0; // Базовый случай:  нет  1-значных  чисел  с  суммой  цифр  0
        }
        if (k == 1) {
            return 1; //  Базовый  случай:  одно  1-значное  число  с  суммой  цифр  s
        }
        int count = 0;
        for (int i = 1; i <= 9; i++) { //  Перебираем  первую  цифру  от  1  до  9
            if (s - i >= 0) {
                count += countNumbers(k - 1, s - i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите натуральное число k: ");
            int k = scanner.nextInt();
            System.out.print("Введите натуральное число s: ");
            int s = scanner.nextInt();
            int count = countNumbers(k, s);
            System.out.println("Количество чисел: " + count);
        }
    }
}
