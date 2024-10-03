package ru.mirea.practice.s23k0164;

public final class Seven {

    private Seven() {

    }

    public static void main(String[] args) {
        int number = 5;
        long result = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + result);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
