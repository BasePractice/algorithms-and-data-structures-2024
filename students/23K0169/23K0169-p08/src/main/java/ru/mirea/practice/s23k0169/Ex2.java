package ru.mirea.practice.s23k0169;

// кол-во заданий: 17, номер варианта: 19, начало: 2 задание

public final class Ex2 {

    private Ex2() {

    }

    public static void printNumbers(int n) {
        if (n < 1) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
