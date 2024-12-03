package ru.mirea.practice.s23k0505.task4;

public abstract class Main {
    public static int sumofKdigits(int k, int s, int maxK) {
        if (k == 1) {
            if (s >= 0 && s < 10) {
                return 1;
            } else {
                return 0;
            }
        }
        int sum = 0;
        if (k == maxK) {
            for (int i = 1; i < 10; i++) {
                sum += sumofKdigits(k - 1, s - i, maxK);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                sum += sumofKdigits(k - 1, s - i, maxK);
            }
        }
        return sum;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int k = 3;
        int s = 15;

        System.out.println(sumofKdigits(k, s, k));

        int count = 0;
        for (int i = 100; i < 1000; i++) {
            if (sumOfDigits(i) == s) {
                //System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
