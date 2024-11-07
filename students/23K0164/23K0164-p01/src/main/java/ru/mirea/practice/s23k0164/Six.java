package ru.mirea.practice.s23k0164;

public final class Six {

    private Six() {

    }

    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("1/%d = %.4f%n", i, harmonicNumber);
        }
    }
}
