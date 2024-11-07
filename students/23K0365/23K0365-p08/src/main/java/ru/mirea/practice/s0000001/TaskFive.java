package ru.mirea.practice.s0000001;

public abstract class TaskFive {
    public static int sumN(int n) {
        int temp = 0;
        temp += n % 10;
        if (n > 9) {
            temp += sumN(n / 10);
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(sumN(2323));
    }
}
