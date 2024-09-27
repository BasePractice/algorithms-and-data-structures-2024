package ru.mirea.practice.s23k0120.task6;

public abstract class Main {
    public static void main(String[] args) {
        float partSum = 0;
        for (int i = 1; i < 11; i++) {
            partSum += 1 / (float) i;
            System.out.printf("%d-е число гармонического ряда: ", i);
            for (int j = 1; j < i; j++) {
                System.out.printf("1/%d + ", j);
            }
            System.out.printf("1/%d = %f\n", i, partSum);
        }
    }
}
