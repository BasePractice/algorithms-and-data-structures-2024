package mirea.lab8;

/* Задание от 1 до n
Дано натуральное число n. Выведите все числа от 1 до n. */

import java.util.Scanner;

public abstract class Prac8p2 {
    public static void rec(int n) {
        if (n != 0) {
            rec(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите n: ");
            int n = sc.nextInt();
            rec(n);
        }
    }
}
