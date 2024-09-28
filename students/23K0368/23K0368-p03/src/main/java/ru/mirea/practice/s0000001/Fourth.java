package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Fourth {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            System.out.println("Введите число: ");
            while (n == 0) {
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                } else {
                    System.out.println("Введите число!");
                }
            }

            Integer[] array = new Integer[n];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(n);
            }
            System.out.println(Arrays.toString(array));

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    list.add(array[i]);
                }
            }
            System.out.println(list);
        }
    }
}
