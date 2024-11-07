package ru.mirea.practice.s23k0169;

public final class Ex3 {

    private Ex3() {

    }

    public static void printRange(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return;
        }
        System.out.println(a);
        printRange(a + 1, b);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        printRange(a, b);
    }
}
