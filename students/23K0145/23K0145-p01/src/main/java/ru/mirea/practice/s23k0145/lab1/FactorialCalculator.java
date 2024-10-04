package ru.mirea.practice.s23k0145.lab1;

public abstract class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;  // Пример числа для вычисления факториала
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " = " + factorial);
    }

    // Метод для вычисления факториала с использованием цикла
    public static long calculateFactorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
