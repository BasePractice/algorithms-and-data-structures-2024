package ru.mirea.practice.s23l0908.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            int n;

            do {
                System.out.println("Number must be bigger than zero.");
                System.out.print("Input your number: ");
                n = input.nextInt();
            } while (n <= 0);

            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) {
                nums[i] = random.nextInt(0, n + 1); // Works for Java 17+
            }
            System.out.println("First: " + Arrays.toString(nums));

            int[] nums2 = new int[n >> 1];
            for (int i = 0; i < nums2.length; ++i) {
                nums2[i] = nums[(i << 1) + 1];
            }

            if (nums2.length != 0) {
                System.out.println("Second: " + Arrays.toString(nums2));
            }
        }
    }
}

