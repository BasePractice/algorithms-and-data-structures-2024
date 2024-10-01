package ru.mirea.practice.lab1;

import java.util.Scanner;

public abstract class Proj3 {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        int[] mas = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < mas.length; i++) {
                if (sc.hasNextInt()) {
                    mas[i] = sc.nextInt();
                } else {
                    System.out.println("Вы ввели не целое число");
                    sc.next();
                    i--;
                }
            }
        }
        for (int ma : mas) {
            sum += ma;
        }
        avg = (float) sum / mas.length;
        System.out.println("Сумма чисел - " + sum + "\nСреднее арифметическое - " + avg);
    }
}
