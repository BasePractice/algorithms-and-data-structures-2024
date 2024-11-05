package ru.mirea.practice.s23k0505.task5;

public abstract class Main {
    public static int sumofdigits(int num) {
        if (num / 10 == 0) {
            return num % 10;
        }
        return num % 10 + sumofdigits(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumofdigits(333));
    }
}
