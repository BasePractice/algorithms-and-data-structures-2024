package ru.mirea.practice.s23L0908;

public abstract class TaskThree {
    public static void atob(int a, int b) {
        if (a < b) {
            System.out.println(a);
            atob(a + 1, b);
        }
        if (a > b) {
            System.out.println(b);
            atob(a, b - 1);
        }
        if (a == b) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        atob(3, 15);
    }
}
