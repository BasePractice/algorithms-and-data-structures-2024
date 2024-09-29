package ru.mirea.practice.s23k0093;

//Написать программу, в результате которой массив чисел создается с
//помощью инициализации (как в Си) вводится и считается в цикле сумма
//элементов целочисленного массива, а также среднее арифметическое его
//элементов результат выводится на экран. Использовать цикл for.

import java.util.Arrays;

public abstract class Main {
    public static void main(String[] args) {
        int[] b = {1, 4, -6, 7, 9};
        int summ = 0;
        for (int i : b) {
            summ += i;
        }
        System.out.println(Arrays.toString(b));
        System.out.printf("Сумма: %d, Ср. знач.: %d", summ, summ / b.length);
    }
}