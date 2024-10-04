package ru.mirea.practice.s23k0087;

public abstract class Task4 {
    public static int countNumbers(int k, int s) {
        if (k == 0) {
            return (s == 0) ? 1 : 0;
        }

        int count = 0;
        int start = (k == 1) ? 1 : 0; // Первая цифра не может быть 0
        for (int digit = start; digit <= 9; digit++) {
            if (s - digit >= 0) {
                count += countNumbers(k - 1, s - digit);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 2;
        int s = 17;
        System.out.println(countNumbers(k, s));
    }
}
