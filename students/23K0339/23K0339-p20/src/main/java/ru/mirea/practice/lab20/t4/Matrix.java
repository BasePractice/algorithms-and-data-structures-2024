package ru.mirea.practice.lab20.t4;

public class Matrix<T extends Number> {
    private final T[][] matrix;


    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }


    public Matrix<T> add(Matrix<T> other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        T[][] result = (T[][]) new Number[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() + other.matrix[i][j].doubleValue());
            }
        }

        return new Matrix<>(result);
    }


    public Matrix<T> multiply(Matrix<T> other) {
        int rows = matrix.length;
        int cols = other.matrix[0].length;
        int common = matrix[0].length;
        T[][] result = (T[][]) new Number[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = (T) Double.valueOf(0);
                for (int k = 0; k < common; k++) {
                    result[i][j] = (T) Double.valueOf(result[i][j].doubleValue() + matrix[i][k].doubleValue() * other.matrix[k][j].doubleValue());
                }
            }
        }

        return new Matrix<>(result);
    }


    public void printMatrix() {
        for (T[] row : matrix) {
            for (T value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

