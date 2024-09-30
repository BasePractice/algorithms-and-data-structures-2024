package ru.mirea.practice.s23k0087;

public abstract class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("1/%d = %.4f%n", i, 1.0 / i);
        }
    }
    
}
