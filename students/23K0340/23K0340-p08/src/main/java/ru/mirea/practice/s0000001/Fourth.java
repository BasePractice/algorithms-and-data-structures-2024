package ru.mirea.practice.s0000001;

public abstract class Fourth {
    public static int rec(int k1, int k, int s) {
        int n = 0;
        int i;
        if (k == 1 && s / 10 == 0) {
            return 1;
        } else if (k == 1) {
            return 0;
        }
        if (k1 == k) {
            i = 1;
        } else {
            i = 0;
        }
        while (i < 10) {
            n += rec(k,k - 1, s - i);
            i++;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(rec(3,3,26));
    }
}
