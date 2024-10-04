package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Matrix {
    private int[][] mas;
    private int n;
    private int m;

    Scanner sc = new Scanner(System.in);

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.mas = new int[n][m];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                System.out.println("mas[" + i + "][" + j + "]:");
                this.mas[i][j] = sc.nextInt();
            }
        }
    }

    public int[][] getMas() {
        return this.mas;
    }

    public void sum(int[][] mas2) {
        for (int i = 0;i < this.n;i++) {
            for (int j = 0;j < this.m;j++) {
                this.mas[i][j] += mas2[i][j];
            }
        }
    }

    public void scale(int scal) {
        for (int i = 0;i < this.n;i++) {
            for (int j = 0;j < this.m;j++) {
                this.mas[i][j] *= scal;
            }
        }
    }

    public void string() {
        System.out.println("Matrix " + this.n + "x" + this.m + ":");
        for (int i = 0;i < this.n;i++) {
            for (int j = 0;j < this.m;j++) {
                System.out.print("[" + this.mas[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
