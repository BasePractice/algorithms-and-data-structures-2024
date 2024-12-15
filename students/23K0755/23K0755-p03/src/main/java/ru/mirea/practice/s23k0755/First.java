package ru.mirea.practice.s23k0755;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Задания на Math и Random
Создать массив вещественных чисел случайным образом, вывести его
на экран, отсортировать его, и снова вывести на экран (использовать два подхода
к генерации случайных чисел – метод random() класса Math и класс Random
*/

public abstract class First {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter size of arrays: ");
            int size = scanner.nextInt();
            // диапозон, в котором будут генерироваться числа
            float maxNumb = 100f;
            float minNumb = -100f;
            float[] firstMas = new float[size];
            float[] secondMas = new float[size];
            Random rand = new Random();
            // заполняем 2 массива числами
            for (int i = 0; i < size; i++) {
                firstMas[i] = rand.nextFloat() * (maxNumb - minNumb) + minNumb;
                secondMas[i] = (float) Math.random() * (maxNumb - minNumb) + minNumb;
            }
            // выводим массивы
            System.out.println("\nFirst array:\t" + Arrays.toString(firstMas));
            System.out.println("Second array:\t" + Arrays.toString(secondMas));

            Arrays.sort(firstMas);  // метод класса Arrays, который сортирует массив
            float t;    // вспомогатеольная переменная для перезаписи значений
            // сортировка массива пузырьком
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (secondMas[i] > secondMas[j]) {
                        t = secondMas[i];
                        secondMas[i] = secondMas[j];
                        secondMas[j] = t;
                    }
                }
            }
            // вывод остортированных массивов
            System.out.println("\nSorted first array:\t\t" + Arrays.toString(firstMas));
            System.out.println("Sorted second array:\t" + Arrays.toString(secondMas));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
