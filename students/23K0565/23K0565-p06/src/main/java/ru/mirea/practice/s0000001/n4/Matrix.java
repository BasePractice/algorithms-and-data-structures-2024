package ru.mirea.practice.s0000001.n4;

public class Matrix {
    private double[][] data;

    public Matrix(double[][] data) {
        this.data = data;
    }

    public void print() {
        for (double[] row : data) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix other) {
        int rows = this.data.length;
        int cols = this.data[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiplyByNumber(double number) {
        int rows = this.data.length;
        int cols = this.data[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.data[i][j] * number;
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        int rows1 = this.data.length;
        int cols1 = this.data[0].length;
        int rows2 = other.data.length;
        int cols2 = other.data[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Invalid matrix dimensions for multiplication.");
        }

        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(result);
    }
}