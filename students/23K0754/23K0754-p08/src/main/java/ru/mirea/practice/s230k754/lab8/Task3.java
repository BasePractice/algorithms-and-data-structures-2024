package ru.mirea.practice.s230k754.lab8;

public final class Task3 {
    private Task3() {}

    private static void func(int a, int b) {
        if (a > b) {
            System.out.print(a + " ");
            func(a - 1, b);
        } else if (a < b) {
            System.out.print(a + " ");
            func(a + 1, b);
        } else {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        func(1, 5);
        func(5, 1);
    }
}
