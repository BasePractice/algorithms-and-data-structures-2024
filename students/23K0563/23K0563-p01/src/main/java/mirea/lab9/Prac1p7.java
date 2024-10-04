package mirea.lab1;

import java.util.Scanner;

public abstract class Prac1p7 {
    public static int fact(int a) {
        int an = 1;
        for (int i = 1; i <= a; i++) {
            an *= i;
        }
        return an;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int a = sc.nextInt();
            System.out.println("Факториал числа: " + fact(a));
        }
    }
}
