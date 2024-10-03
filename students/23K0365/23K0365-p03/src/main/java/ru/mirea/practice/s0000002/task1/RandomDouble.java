package ru.mirea.practice.s0000002.task1;

import java.util.Random;

public abstract class RandomDouble {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("First: ");
        int lenAr = rand.nextInt(11);
        System.out.println("Lenght of array is " + lenAr);

        double[] arr1 = new double[lenAr];
        for (int i = 0; i < lenAr; i++) {
            arr1[i] = (rand.nextInt(11) * 10) / rand.nextInt(11);//rand.nextDouble(20);т.к.: не удается использовать nextDouble}
            System.out.print(arr1[i] + "; ");
        }
        System.out.println();

        System.out.println("Second:");
        lenAr = (int)(Math.random() * 10 + 1);
        System.out.println("Lenght of array is " + lenAr);
        double[] arr2 = new double[lenAr];
        for (int i = 0; i < lenAr; i++) {
            arr2[i] = Math.random() * 10;
            System.out.print(arr2[i] + "; ");
        }
    }
}