package ru.mirea.practice.s23L0908;

public final class Ex2 {

    private Ex2() {
        // Тут нечего искать
    }

    public static void main(String[] args) {
        int n = 100;
        printNumbers(1, n);
    }

    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, n);
    }
}
