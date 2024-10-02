package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

public class MatrixOperations {
    private double[][] data;
    private int rows;
    private int cols;

    public MatrixOperations(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    public MatrixOperations(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public MatrixOperations add(MatrixOperations other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }
        MatrixOperations result = new MatrixOperations(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public MatrixOperations multiplyByScalar(double scalar) {
        MatrixOperations result = new MatrixOperations(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    public MatrixOperations multiply(MatrixOperations other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
        }
        MatrixOperations result = new MatrixOperations(this.rows, other.cols);
        for (int i = 0; i < result.rows; i++) {
            for (int j = 0; j < result.cols; j++) {
                result.data[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}