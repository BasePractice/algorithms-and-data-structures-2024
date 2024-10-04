package Task2;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int i = 0;
        while (i < n) {
            sum += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
            i++;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}


