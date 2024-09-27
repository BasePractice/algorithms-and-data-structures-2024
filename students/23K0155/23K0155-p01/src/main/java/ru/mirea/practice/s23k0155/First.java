package ru.mirea.practice.s23k0155;

import java.util.Arrays;
import java.util.Scanner;

public abstract class First {
    public static void main(String[] args) {
        int alSum = 0;
        int x;
        int[] mas;
        System.out.print("Enter the number of numbers:\t");
        try (Scanner sc = new Scanner(System.in)) { // создание переменной sc, класса Scanner
            x = sc.nextInt();
            mas = new int[x]; // создание массива
            for (int i = 0; i < x; i++) {
                System.out.print("Enter number:\t");
                mas[i] = sc.nextInt();  // 11 стр. считывается знач с клав. и добавляется в массив.
                alSum += mas[i];
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        float t = (float) alSum / (float) x;
        System.out.println("Yor mas:" + Arrays.toString(mas));
        System.out.println("Sum of all elements:" + alSum);
        System.out.println("Arithmetic mean:" + t);
    }
}
