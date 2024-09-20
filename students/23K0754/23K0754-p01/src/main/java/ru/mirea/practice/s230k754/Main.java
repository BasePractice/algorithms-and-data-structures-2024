package ru.mirea.practice.s230k754;


import java.util.Scanner;

public final class Main {

    private Main() {

    }
    public static void task3(){
        try(Scanner scanner = new Scanner(System.in)){
            int[] numbers = new int[10]; // Массив 10 чисел
            int sum = 0;
            System.out.println("Введите 10 чисел:");

            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextInt(); // Считываем число и добавляем в массив
                sum += numbers[i];
            }
            float middleSum = (float) sum / 10;


            System.out.println("Сумма: " +  sum);
            System.out.println("Среднее арифметич: " + middleSum);
        }
    }

    public static void task45() {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите кол-во числе в массиве: ");
            int n = scanner.nextInt();
            int[] numbers = new int[n]; // Массив n чисел
            int sum = 0;
            System.out.println("Введите "+ n + " чисел:");
            int i = 0;
            int max = -99999;
            int min =  99999;
            while (i < n) {
                numbers[i] = scanner.nextInt(); // Считываем число и добавляем в массив
                sum += numbers[i];
                if (numbers[i] >= max) {max = numbers[i];}
                if (numbers[i] <= min) {min = numbers[i];}
                i++;
            }

            System.out.println("Сумма:" + sum);
            System.out.println("Максимальное числоа: " + max);
            System.out.println("Минимальное число: " + min);

            System.out.println("Числа из массива:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }


    }

    public static void main(String[] args) {
        task3();
        task45();
    }
}
