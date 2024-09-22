package ru.mirea.practice.s0000001;
import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int fact = 1;

        System.out.println("Введите число для вычисления факториала");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }

        for (int i=2; i<=n; i++){
            fact *= i;
        }

        System.out.println(fact);
    }
}
