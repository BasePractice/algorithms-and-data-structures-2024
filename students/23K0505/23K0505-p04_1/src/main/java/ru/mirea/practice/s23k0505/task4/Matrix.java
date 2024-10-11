package ru.mirea.practice.s23k0505.task4;

import java.util.Arrays;

public class Matrix {
    private float[][] values;
    private int rows;
    private int columns;

    public Matrix(float[][] arr) {
        this.values = arr;
        this.rows = arr.length;
        this.columns = arr[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void add(Matrix matrix) {
        if (matrix.columns != this.getColumns() || matrix.rows != this.getRows()) {
            throw new RuntimeException(String.format("Size mismatch error: attempting to add %s to %s", matrix.size(), this.size()));
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.values[i][j] += matrix.values[i][j];
            }
        }
    }

    public static Matrix add(Matrix matrixA, Matrix matrixB) {
        if (matrixA.columns != matrixB.getColumns() || matrixA.rows != matrixB.getRows()) {
            throw new RuntimeException(String.format("Size mismatch error: attempting to add %s to %s", matrixB.size(), matrixB.size()));
        }
        Matrix matrix = new Matrix(new float[matrixB.rows][matrixA.columns]);

        for (int i = 0; i < matrixA.rows; i++) {
            for (int j = 0; j < matrixA.columns; j++) {
                matrix.values[i][j] = matrixA.values[i][j] + matrixB.values[i][j];
            }
        }
        return matrix;
    }

    public void multiply(float scalar) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.values[i][j] *= scalar;
            }
        }
    }

    public static Matrix multiply(Matrix matrix, float scalar) {
        Matrix matrixA = new Matrix(new float[matrix.rows][matrix.columns]);

        for (int i = 0; i < matrixA.rows; i++) {
            for (int j = 0; j < matrixA.columns; j++) {
                matrix.values[i][j] *= scalar;
            }
        }
        return matrixA;
    }

    public static Matrix multiply(Matrix matrixA, Matrix matrixB) {
        return matrixA.multiplyRight(matrixB);
    }

    public Matrix multiplyRight(Matrix matrix) {
        if (matrix.getRows() != this.columns) {
            throw new RuntimeException(String.format("Size mismatch error: attempting to multiply %s to %s", matrix.size(), this.size()));
        }
        float cellSum = 0;
        Matrix matrix1 = new Matrix(new float[this.rows][matrix.columns]);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    cellSum += this.values[i][k] * matrix.values[k][j];
                }
                matrix1.values[i][j] = cellSum;
                cellSum = 0;
            }
        }
        return matrix1;
    }

    public Matrix multiplyLeft(Matrix matrix) {
        if (this.getRows() != matrix.columns) {
            throw new RuntimeException(String.format("Size mismatch error: attempting to multiply %s to %s", matrix.size(), this.size()));
        }
        float cellSum = 0;
        Matrix matrix1 = new Matrix(new float[matrix.rows][this.columns]);
        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                for (int k = 0; k < matrix.columns; k++) {
                    cellSum += matrix.values[i][k] * this.values[k][j];
                }
                matrix1.values[i][j] = cellSum;
                cellSum = 0;
            }
        }
        return matrix1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (float[] row : values) {
            stringBuilder.append(Arrays.toString(row));
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    public String size() {
        return "Matrix{" + this.rows + "x" + this.columns + "}";
    }
}
