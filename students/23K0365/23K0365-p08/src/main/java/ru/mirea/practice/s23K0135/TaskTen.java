package ru.mirea.practice.s23K0135;

public abstract class TaskTen {
    public static int reverseNum(int a, int x) {
        if (a == 0) {
            return x;
        }
        return reverseNum(a / 10, x * 10 + a % 10);
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(1234,0));
    }
}
