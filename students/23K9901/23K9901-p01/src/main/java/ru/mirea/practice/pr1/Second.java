package ru.mirea.practice.pr1;

import java.util.Scanner;

public abstract class Second {
    public static void main(String[] args) {
        int num;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of elems: ");
            num = sc.nextInt();
            int[] numbers = new int[num];
            System.out.println(num);
            for (int i = 0; i < num; i++) {
                numbers[i] = sc.nextInt();
            }

            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }
    }
}
