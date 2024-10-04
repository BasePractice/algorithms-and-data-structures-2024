package ru.mirea.practice.s0000001.task1;

public abstract class Task4 {
    public static void main(String[] args) {
        int k = 3;
        int s = 5;
        int count = 0;

        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            if (sumOfDigits(i) == s) {
                count++;
            }
        }

        System.out.println("Количество чисел: " + count);
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
