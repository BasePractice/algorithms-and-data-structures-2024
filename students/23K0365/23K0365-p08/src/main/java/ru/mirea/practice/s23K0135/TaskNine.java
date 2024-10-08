package ru.mirea.practice.s23K0135;

public abstract class TaskNine {
    public static int howMuch(int a, int b, int x) {
        if (a == 0 && b == 0) {
            return 1;
        }
        int cnt = 0;
        if (b > 0) {
            cnt += howMuch(a, b - 1, 1);
        }
        if (x != 0 && a > 0) {
            cnt += howMuch(a - 1, b, 0);
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(howMuch(1,4,1));
    }
}
