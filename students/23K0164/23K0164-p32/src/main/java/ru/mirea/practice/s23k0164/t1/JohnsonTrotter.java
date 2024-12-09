package ru.mirea.practice.s23k0164.t1;

public final class JohnsonTrotter {
    private JohnsonTrotter() {

    }

    private static final boolean LeftToRight = true;
    private static final boolean RightToLeft = false;

    public static int searchArr(int[] a, int n, int mobile) {
        for (int i = 0; i < n; i++) {
            if (a[i] == mobile) {
                return i + 1;
            }
        }

        return 0;
    }

    public static int getMobile(int[] a, boolean[] dir, int n) {
        int mobilePrev = 0;
        int mobile = 0;

        for (int i = 0; i < n; i++) {
            if (dir[a[i] - 1] == RightToLeft && i != 0) {
                if (a[i] > a[i - 1] && a[i] > mobilePrev) {
                    mobile = a[i];
                    mobilePrev = mobile;
                }
            }

            if (dir[a[i] - 1] == LeftToRight
                && i != n - 1) {
                if (a[i] > a[i + 1] && a[i] > mobilePrev) {
                    mobile = a[i];
                    mobilePrev = mobile;
                }
            }
        }

        if (mobile == 0 && mobilePrev == 0) {
            return 0;
        } else {
            return mobile;
        }
    }

    public static int printOnePerm(int[] a, boolean[] dir, int n) {
        int mobile = getMobile(a, dir, n);
        int pos = searchArr(a, n, mobile);
        if (dir[a[pos - 1] - 1] == RightToLeft) {
            int temp = a[pos - 1];
            a[pos - 1] = a[pos - 2];
            a[pos - 2] = temp;
        } else if (dir[a[pos - 1] - 1] == LeftToRight) {
            int temp = a[pos];
            a[pos] = a[pos - 1];
            a[pos - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > mobile) {
                if (dir[a[i] - 1] == LeftToRight) {
                    dir[a[i] - 1] = RightToLeft;
                } else if (dir[a[i] - 1] == RightToLeft) {
                    dir[a[i] - 1] = LeftToRight;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }

        System.out.print(" ");

        return 0;
    }

    public static int fact(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void printPermutation(int n) {
        int[] a = new int[n];
        boolean[] dir = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            System.out.print(a[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < n; i++) {
            dir[i] = RightToLeft;
        }

        for (int i = 1; i < fact(n); i++) {
            printOnePerm(a, dir, n);
        }
    }

    public static void main(String[] argc) {
        int n = 4;
        printPermutation(n);
    }
}
