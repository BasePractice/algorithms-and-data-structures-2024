package ru.mirea.practice.s0000001.num1;

public class Fact {
    public long calc(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}

