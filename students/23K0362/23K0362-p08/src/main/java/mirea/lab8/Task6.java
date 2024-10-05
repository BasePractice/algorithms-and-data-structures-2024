package mirea.lab9;

import java.util.Scanner;

abstract class Task6 {
    public static int inputNaturalNumbers(String strNumber) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число " + strNumber + " (>1) > ");
            number = sc.nextInt();
            if (number < 2) {
                System.out.println("Неправильно введённое значение.");
                return inputNaturalNumbers(strNumber);
            }
            return number;
        }
    }

    public static boolean isPrimary(int number, int divisor) {
        if (divisor > Math.pow(number, 0.5)) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrimary(number, divisor + 1);
    }

    public static void main(String[] args) {
        int inputNumber = inputNaturalNumbers("number");
        System.out.println("Ответ: " + isPrimary(inputNumber, 2));
    }
}
