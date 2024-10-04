package ru.mirea.practice.s0000001;


import java.util.Scanner;

/**
 * Дана монотонная последовательность, в которой каждое натуральное
 * число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, ...
 * По данному натуральному n выведите первые n членов этой
 * последовательности. Попробуйте обойтись только одним циклом for.
 */

public abstract class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                printer(i, i);
            }
        }
    }

    public static void printer(int numba, int am) {
        if (0 == am) {
            return;
        }
        System.out.println(numba);
        printer(numba, am - 1);
    }
}
