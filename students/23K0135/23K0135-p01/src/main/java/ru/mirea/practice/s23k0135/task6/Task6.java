package ru.mirea.practice.s23k0135.task6;

public abstract class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
            System.out.printf("Число %2d: %.4f\n", i, sum);
        }
    }
}
