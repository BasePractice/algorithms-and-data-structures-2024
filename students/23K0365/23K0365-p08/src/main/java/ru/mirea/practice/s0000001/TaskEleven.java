package ru.mirea.practice.s0000001;

public abstract class TaskEleven {
    public static int cntOfOnes(int a) {
        if (a == 0) {
            return 0;
        }
        if (a % 10 == 1) {
            return 1 + cntOfOnes(a / 10);
        } else {
            return 0 + cntOfOnes(a / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(cntOfOnes(11198700));
    }
}
