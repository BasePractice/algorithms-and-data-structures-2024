package ru.mirea.practice.s23k0350.task1;

public class Factorsi {
    int a = 1;

    public void increase(int n) {
        if (a > n) {
            return;
        }
        System.out.print(a + "\n");
        a = a + 1;
        increase(n);
    }
}






