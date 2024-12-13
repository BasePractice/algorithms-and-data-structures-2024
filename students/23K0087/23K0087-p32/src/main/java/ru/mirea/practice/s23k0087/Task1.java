package ru.mirea.practice.s23k0087;


public abstract class Task1 {
    public static void perm(int n) {
        int[] p = new int[n];
        int[] pi = new int[n];
        int[] dir = new int[n];
        for (int i = 0; i < n; i++) {
            dir[i] = -1;
            p[i] = i;
            pi[i] = i;
        }
        perm(0, p, pi, dir);
        System.out.println("   (0 1)");
    }

    public static void perm(int n, int[] p, int[] pi, int[] dir) {
        if (n >= p.length) {
            for (int j : p) {
                System.out.println(j);
            }
            return;
        }
        perm(n + 1, p, pi, dir);
        for (int i = 0; i <= n - 1; i++) {
            System.out.printf("   (%d %d)\n", pi[n], pi[n] + dir[n]);
            int z = p[pi[n] + dir[n]];
            p[pi[n]] = z;
            p[pi[n] + dir[n]] = n;
            pi[z] = pi[n];
            pi[n] = pi[n] + dir[n];

            perm(n + 1, p, pi, dir);
        }
        dir[n] = -dir[n];
    }

    public static void main(String[] args) {
        perm(5);
    }
}
