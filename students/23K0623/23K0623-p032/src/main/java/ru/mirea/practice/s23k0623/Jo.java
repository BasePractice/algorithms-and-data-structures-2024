package ru.mirea.practice.s23k0623;

public abstract class Jo {
    private static boolean ltr = true;
    private static boolean rtl = false;

    public static int searcher(int[] a, int n, int dir) {
        for (int i = 0; i < n; i++) {
            if (a[i] == dir) {
                return i + 1;
            }
        }
        return 0;
    }

    public static int getDir(int[] a, boolean[] dir, int n) {
        int mobileprev = 0;
        int mobile = 0;
        for (int i = 0; i < n; i++) {
            if (dir[a[i] - 1] == rtl && i != 0) {
                if (a[i] > a[i - 1] && a[i] > mobileprev) {
                    mobile = a[i];
                    mobileprev = mobile;
                }
            }
            if (dir[a[i] - 1] == ltr && i != n - 1) {
                if (a[i] > a[i + 1] && a[i] > mobileprev) {
                    mobile = a[i];
                    mobileprev = mobile;
                }
            }
        }
        if (mobile == 0) {
            return 0;
        } else {
            return mobile;
        }
    }

    public static int printone(int[] a, boolean[] dir, int n) {
        int mobile = getDir(a, dir, n);
        int pos = searcher(a, n, mobile);
        if (dir[a[pos - 1] - 1] == rtl) {
            int temp = a[pos - 1];
            a[pos - 1] = a[pos - 2];
            a[pos - 2] = temp;
        } else if (dir[a[pos - 1] - 1] == ltr) {
            int temp = a[pos];
            a[pos] = a[pos - 1];
            a[pos - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > mobile) {
                dir[a[i] - 1] = !dir[a[i] - 1];
            }
        }
        for (int value : a) {
            System.out.println(value);
        }
        System.out.println(" ");
        return 0;
    }

    public static int factor(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void printer(int n) {
        int[] a = new int[n];
        boolean[] dir = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            System.out.println(a[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            dir[i] = rtl;
        }
        for (int i = 1; i < factor(n); i++) {
            printone(a, dir, n);
        }
    }
}
