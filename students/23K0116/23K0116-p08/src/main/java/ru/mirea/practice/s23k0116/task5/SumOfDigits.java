package ru.mirea.practice.s23k0116.task5;

public abstract class SumOfDigits {

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        //  берем последнюю цифру (n % 10) и добавляем результат вызова для оставшейся части числа (n / 10)
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Сумма цифр числа " + n + " = " + sumOfDigits(n));
    }
}
