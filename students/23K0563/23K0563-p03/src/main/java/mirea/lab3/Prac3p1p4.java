package mirea.lab3;

/* 4. Пользователь должен ввести с клавиатуры размер массива -
натуральное число больше, так чтобы введенное пользователем число
сохранялось в переменную n. Если пользователь ввел не подходящее число, то
программа должна просить пользователя повторить ввод. Создать массив из n
случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
массив только из четных элементов первого массива, если они там есть, и
вывести его на экран. */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Prac3p1p4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int n;
            while (true) {
                System.out.print("\nВведите размер массива n: ");
                n = sc.nextInt();
                if (n <= 1) {
                    System.out.println("Неверное число, повторите ввод");
                } else {
                    break;
                }
            }
            int[] a = new int[n];
            int ch = 0;
            for (int i = 0; i < n; i++) {
                a[i] = rand.nextInt(n + 1);
                if (a[i] % 2 == 0) {
                    ch++;
                }
            }
            System.out.println(Arrays.toString(a));
            if (ch > 0) {
                int[] c = new int[ch];
                int i = 0;
                int x = 0;
                while (i < ch) {
                    if (a[x] % 2 == 0) {
                        c[i] = a[x];
                        i++;
                        x++;
                    } else {
                        x++;
                    }
                }
                System.out.println(Arrays.toString(c));
            }
        }
    }
}
