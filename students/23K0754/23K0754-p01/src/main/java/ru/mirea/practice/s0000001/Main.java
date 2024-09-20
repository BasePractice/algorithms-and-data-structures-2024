package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class Main {

    private Main() {

    }

    public static void task3(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // Массив 10 чисел
        int sum = 0;
        System.out.println("Введите 10 чисел:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt(); // Считываем число и добавляем в массив
            sum += numbers[i];
        }
        float middle_sum = (float) sum / 10;

//        System.out.println("Введенные числа:");
//        for (int number : numbers) { // Выводим все числа из массива
//            System.out.print(number + " ");
//        }
        System.out.println("Сумма: " +  sum);
        System.out.println("Среднее арифметич: " + middle_sum);

    }

    public static void task4_5() {
        Scanner scanner = new Scanner(System.in);
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
            if (numbers[i] >= max) {max = numbers[i];};
            if (numbers[i] <= min) {min = numbers[i];};
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
    public static void task6() {
        for(int i = 1; i < 11; i++ ) {
            System.out.print(1.0 / i + "\t");
        }
    }
    public static long factorial(int number){
        if (number < 0){
            System.out.println("Число должно быть не отрицательное");
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }

    }
    public static void task7() {
        System.out.println("\n Введите число: ");
        Scanner scanner = new Scanner(System.in);
        long result = factorial(scanner.nextInt());
        if(result != -1){
            System.out.println("Факториал числа равен: " + result);
        }
    }

    public static void main(String[] args) {
        task3();
        task4_5();
        task6();
        task7();
    }
}
