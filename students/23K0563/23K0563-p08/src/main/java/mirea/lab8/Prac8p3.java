package mirea.lab8;

/* Задание от A до B
Даны два целых числа A и В (каждое в отдельной строке). Выведите все
числа от A до B включительно, в порядке возрастания, если A < B, или в порядке
убывания в противном случае */

import java.util.Scanner;

public abstract class Prac8p3 {
    public static void rec(int a, int b) {
        if (a < b) {
            rec(a, b - 1);
            System.out.println(b);
        } else if (a > b) {
            System.out.println(a);
            rec(a - 1, b);
        } else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите a: ");
            int a = sc.nextInt();
            System.out.print("\nВведите b: ");
            int b = sc.nextInt();
            rec(a, b);
        }
    }
}
