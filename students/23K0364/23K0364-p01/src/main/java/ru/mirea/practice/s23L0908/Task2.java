package ru.mirea.practice.s23L0908;

import java.util.Scanner;

public abstract class Task2 {

    public static long calculate(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число для факториала: ");
            int num = scan.nextInt();
            long result = calculate(num);
            System.out.println("Факториал числа " + num + " равен " + result);
        }
    }
}



