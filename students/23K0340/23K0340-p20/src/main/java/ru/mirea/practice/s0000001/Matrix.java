package ru.mirea.practice.s0000001;

public class Matrix<T extends Number> {
    private T[][] mat;
    private int n;
    private int m;

    public Matrix(T[][] mat) {
        this.n = mat.length;
        this.m = mat[0].length;
        this.mat = mat;
    }

    public Matrix<T> sum(Matrix mat2) {
        T[][] res = (T[][]) new Number[n][m];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                res[i][j] = (T)(Number)(mat[i][j].doubleValue() + mat2.mat[i][j].doubleValue());
            }
        }
        return new Matrix<>(res);
    }

    public Matrix<T> scale(T s) {
        T[][] res = (T[][]) new Number[n][m];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < m;j++) {
                res[i][j] = (T)(Number)(mat[i][j].doubleValue() * s.doubleValue());
            }
        }
        return new Matrix<>(res);
    }
}
