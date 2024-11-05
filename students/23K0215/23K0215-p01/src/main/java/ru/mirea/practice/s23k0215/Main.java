package ru.mirea.practice.s23k0215;

import java.util.Scanner;

//Задача 1:
/*Написать программу, в результате которой массив чисел создается с
        помощью инициализации (как в Си) вводится и считается в цикле сумма
        элементов целочисленного массива, а также среднее арифметическое его
        элементов результат выводится на экран. Использовать цикл for.
 */
//Задача 2:
/*Написать программу, в результате которой массив чисел вводится
пользователем с клавиатуры считается сумма элементов целочисленного
массива с помощью циклов do while, while, также необходимо найти
максимальный и минимальный элемент в массиве, результат выводится на экран
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        //Задача 1:
        int[] mas = {1,2,3,4,5};
        int sum = 0;
        int i = 0;
        while (i < mas.length) {
            sum += mas[i];
            i++;
        }
        int avarage = sum / mas.length;

        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + avarage);

        //Задача 2:

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Укажите размер массива:");
            int n = scanner.nextInt();
            int[] massiv = new int[n];

            i = 0;
            while (i < massiv.length) {
                System.out.println("Укажите " + (i + 1) + " эллемент:");
                massiv[i] = scanner.nextInt();
                i++;
            }
            scanner.close();

            sum = 0;

            i = 0;
            do {
                sum += massiv[i];
                i++;
            } while (i < massiv.length);
            System.out.println("Сумма = " + sum);
            int max = 0;
            int min = 10000000;
            i = 0;
            while (i < massiv.length) {

                if (massiv[i] > max) {
                    max = massiv[i];
                }
                if (massiv[i] < min) {
                    min = massiv[i];
                }
                i++;
            }
            System.out.println("Max = " + max);
            System.out.println("Min = " + min);
        }





    }
}
