package ru.mirea.practice.s23L0908;

public abstract class TaskTwelve {
    public static void notOddNums(int n) {
        if (n != 0) {
            int temp = n % 10;
            notOddNums(n / 10);
            if (temp % 2 != 0) {
                System.out.println(temp);
            }
        }
    }

    public static void main(String[] args) {
        notOddNums(13579246);
    }
}
