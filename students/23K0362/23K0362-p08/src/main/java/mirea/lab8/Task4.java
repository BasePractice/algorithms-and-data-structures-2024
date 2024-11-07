package mirea.lab9;

import java.util.Scanner;

abstract class Task4 {
    public static int countNumbers(int k, int s, boolean isFirst) {
        if (k == 0) {
            return (s == 0) ? 1 : 0;
        }
        int sum = 0;

        int start = isFirst ? 1 : 0; // Если первая цифра, то начинаем с 1
        for (int number = start; number <= 9; number++) {
            if (s >= number) {
                sum += countNumbers(k - 1, s - number, false);
            }
        }

        return sum;
    }

    public static int inputNaturalNumbers(String strNumber) {
        int number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число " + strNumber + " (>0) > ");
            number = sc.nextInt();
            if (number < 1) {
                System.out.println("Неправильно введённое значение.");
                return inputNaturalNumbers(strNumber);
            }
            return number;
        }
    }

    public static void main(String[] args) {
        int k = inputNaturalNumbers("k");
        int s = inputNaturalNumbers("s");

        System.out.println("Количество т k-значных натуральных чисел, "
                           + "сумма цифр которых равна s: " + countNumbers(k, s, true));
    }
}
