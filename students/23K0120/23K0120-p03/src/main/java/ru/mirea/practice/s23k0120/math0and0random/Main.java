package ru.mirea.practice.s23k0120.math0and0random;

import java.util.Arrays;
import java.util.Random;

public abstract class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double[] nums1 = new double[20];
        double[] nums2 = new double[20];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = Math.random();
            nums2[i] = random.nextDouble();
        }
        System.out.printf("Random array: %s\n", Arrays.toString(nums1));

        System.out.printf("Random array: %s\n", Arrays.toString(nums2));

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        System.out.printf("Sorted random array: %s\n", Arrays.toString(nums1));

        System.out.printf("Sorted random array: %s\n", Arrays.toString(nums2));
    }
}
