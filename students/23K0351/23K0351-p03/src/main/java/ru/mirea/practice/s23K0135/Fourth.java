package ru.mirea.practice.s23K0135;

import java.util.Scanner;
import java.util.Random;

public abstract class Fourth {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random rand = new Random();
            System.out.print("input size: ");
            int size = scan.nextInt();
            while (size < 1) {
                System.out.print("non correct num, again pls: ");
                size = scan.nextInt();
            }
            int[] array = new int[size];
            int colChet = 0;
            for (int i = 0; i < size; i++) {
                array[i] = rand.nextInt(size);
                if (array[i] % 2 == 0) {
                    colChet++;
                }
                System.out.printf("%d ", array[i]);
            }
            System.out.println();
            if (colChet > 0) {

                int[] arrayChet = new int[colChet];
                int j = 0;
                for (int i = 0; i < size; i++) {
                    if (array[i] % 2 == 0) {
                        arrayChet[j] = array[i];
                        System.out.printf("%d ", arrayChet[j]);
                        j++;

                    }
                }
            }


        }
    }
}
