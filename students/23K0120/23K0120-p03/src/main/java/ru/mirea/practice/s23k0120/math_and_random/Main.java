package ru.mirea.practice.s23k0120.math_and_random;

import java.util.Arrays;
import java.util.Random;

public abstract class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double[] nums = new double[20];
        double[] nums1 = new double[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random();
            nums1[i] = random.nextDouble();
        }
        System.out.printf("Random array with Math.Random: %s\n", Arrays.toString(nums));

        System.out.printf("Random array with random.nextDouble(): %s\n", Arrays.toString(nums1));

        Arrays.sort(nums);
        Arrays.sort(nums1);

        System.out.printf("Sorted random array with Math.Random: %s\n", Arrays.toString(nums));

        System.out.printf("Sorted random array with random.nextDouble(): %s\n", Arrays.toString(nums1));
    }
}
