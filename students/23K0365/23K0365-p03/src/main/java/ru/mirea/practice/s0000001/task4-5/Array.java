package ru.mirea.practice.s0000001.task4;

import java.util.Random;
import java.util.Scanner;

public abstract class Array {
    public static void main(String[] args) {
        Random rand = new Random();
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            String in;
            System.out.println("Enter ur num:");
            while (true) {
                in = sc.nextLine();
                try {
                    n = Integer.parseInt(in);
                    System.out.println("Correctly. Ur num: " + n);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("\nNot correctly");
                }
            }
            int[] arr1 = new int[n];
            int[] arr2;
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                arr1[i] = rand.nextInt(-1, n);
                if (arr1[i] % 2 == 0 && arr1[i] > 0) {
                    cnt++;
                }
                System.out.print(arr1[i] + "\t");
            }

            if (cnt > 0) {
                System.out.print("\nodd nums:\n");
                arr2 = new int[cnt];
                int j = 0;
                for (int i = 0; i < n; i++) {
                    if (arr1[i] % 2 == 0 && arr1[i] > 0) {
                        arr2[j] = arr1[i];
                        System.out.print(arr2[j] + "\t");
                        j++;
                    }
                }
            }
            System.out.println("\nfinish");


        }
    }
}