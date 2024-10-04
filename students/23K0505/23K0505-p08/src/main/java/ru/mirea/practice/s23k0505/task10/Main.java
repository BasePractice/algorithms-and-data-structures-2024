package ru.mirea.practice.s23k0505.task10;

public abstract class Main {
    public static int reverse(int num, int rev) {
        if (num / 10 == 0) {
            return rev * 10 + num;
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345641, 0));
    }
}
