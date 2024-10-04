package ru.mirea.practice.s23k0350.task2;

class Solution {
    public void rec(int n) {
        int m = 2;
        while (true) {
            if (n % m == 0) {
                System.out.print(m + " ");
                if (m == n) {
                    return;
                }
                break;
            }
            m++;
        }
        rec(n / m);
    }
}