package ru.mirea.practice.s23k0350;

import java.util.Scanner;

public abstract class Lab1task2 {
    public static void main(String[] args) {
        int summa = 0;
        int maxi = -10000;
        int mini = 1000000;
        int i = 1024;
        try (Scanner sc = new Scanner(System.in)) {
            while (i != 0) {
                System.out.print("Введите массив чисел по очереди. "
                        + "Ввод 0 будет считаться знаком "
                        + ", заканчивающим ввод: ");
                i = sc.nextInt();
                if (i != 0) {
                    if (i > maxi) {
                        maxi = i;
                    }
                    if (i < mini) {
                        mini = i;
                    }
                }
                summa += i;
            }
            System.out.println(summa);
            System.out.println(mini);
            System.out.println(maxi);
        }
    }
}
