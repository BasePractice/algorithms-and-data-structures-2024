package ru.mirea.practice.s23k0375.task1;

public abstract class Main {
    public static void main(String[] args) {
        int n = 5;
        int cnt = 0;
        int[][] roadmatr = new int[n][n];
        for (int i = 0;i < n;i++) {
            roadmatr[0] = new int[]{0,1,0,0,0};
            roadmatr[1] = new int[]{1,0,1,1,0};
            roadmatr[2] = new int[]{0,1,0,0,0};
            roadmatr[3] = new int[]{0,1,0,0,0};
            roadmatr[4] = new int[]{0,0,0,0,0};
            for (int j = 0;j < n;j++) {
                //System.out.println(roadmatr[i][j]);
                if (roadmatr[i][j] == 1) {
                    cnt += 1;
                }
            }
            //System.out.println("");
        }
        System.out.println("roadnum=" + cnt / 2);
    }
}
