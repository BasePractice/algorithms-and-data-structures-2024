package ru.mirea.practice.s23k0093;

//Написать программу, в результате которой массив чисел вводится
//пользователем с клавиатуры считается сумма элементов целочисленного
//массива с помощью циклов do while, while, также необходимо найти
//максимальный и минимальный элемент в массиве, результат выводится на экран.

import java.util.Arrays;
import java.util.Scanner;

public abstract class Third {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int maxVal = 0;
        int minVal = 100000000;
        int i = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (i < mas.length) {
                System.out.print("Введите эл. массива: ");
                mas[i] = scanner.nextInt();
                if (minVal > mas[i]) {
                    minVal = mas[i];
                }
                if (maxVal < mas[i]) {
                    maxVal = mas[i];
                }
                i++;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Макс. эл.: " + maxVal);
        System.out.println("Мин. эл.: " + minVal);
    }
}
