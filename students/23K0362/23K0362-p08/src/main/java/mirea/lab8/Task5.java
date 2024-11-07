package mirea.lab9;

import java.util.Scanner;

abstract class Task5 {
    public static int sumNumbers(int number, int sum) {
        if (number == 0) {
            return sum;
        } else {
            return sumNumbers(Math.abs(number) / 10, sum + Math.abs(number) % 10);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите натуральное число N > ");
            int numberN = sc.nextInt();
            System.out.println("Сумма цифр данного числа: " + sumNumbers(numberN, 0));
        }
    }
}
