package ru.mirea.practice.s23k0155.task2;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/*Задания на Math и Random
Пользователь должен ввести с клавиатуры размер массива -
натуральное число больше, так чтобы введенное пользователем число
сохранялось в переменную n. Если пользователь ввел не подходящее число, то
программа должна просить пользователя повторить ввод. Создать массив из n
случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
массив только из четных элементов первого массива, если они там есть, и
вывести его на экран*/

public abstract class Second {
    public static void main(String[] args) {
        boolean flag = true;
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 0;
            // пока flag правда, значение n недопустимо и нужно повторить считывание данных
            while (flag) {
                System.out.print("Enter size of array: ");
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Invalid array size, try again");
                } else {
                    flag = false;
                }
            }
            int[] mas = new int[n];
            int evenCounter = 0;
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                mas[i] = random.nextInt(n + 1);
                if (mas[i] % 2 == 0) {
                    evenCounter++;
                }
            }
            System.out.println("Your array: " + Arrays.toString(mas));
            // Если были чётные эл., то создаём второй массив и заполняем его эл. из 1-го массива
            if (evenCounter > 0) {
                int[] evenMas = new int[evenCounter];
                for (int i = 0, j = 0; i < n; i++) {
                    if (mas[i] % 2 == 0) {
                        evenMas[j] = mas[i];
                        j++;
                    }
                }
                System.out.println("The number of even numbers: " + evenCounter);
                System.out.println("The even array: " + Arrays.toString(evenMas));
            } else {
                System.out.println("Not even numbers");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
