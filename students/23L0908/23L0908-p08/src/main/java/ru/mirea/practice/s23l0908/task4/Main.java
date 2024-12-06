package ru.mirea.practice.s23l0908.task4;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static int recursion(int k, int s, int value) {
        if (value == Math.pow(10, k)) {
            return 0;
        }
        int sum = 0;
        int temp = value;
        for (int i = 0; i < k; i++) {
            sum += value % 10;
            value /= 10;
        }
        if (sum == s) {
            System.out.println(temp);
            return 1 + recursion(k, s, ++temp);
        }
        return recursion(k, s, ++temp);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter k: ");
            int k = in.nextInt();
            System.out.print("Enter s: ");
            int s = in.nextInt();
            System.out.println("There are "
                + recursion(k, s, (int) Math.pow(10, k - 1)) + " "
                + k + "-digit numbers whose sum of digits is " + s + ".");
        }
    }
}
