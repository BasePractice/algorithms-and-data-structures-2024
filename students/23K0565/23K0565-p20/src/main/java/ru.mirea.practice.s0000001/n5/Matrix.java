package ru.mirea.practice.s0000001.n5;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int columns;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Матрицы должны быть одного размера");
        }

        T[][] result = (T[][]) new Number[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = (T) Double.valueOf(data[i][j].doubleValue() + other.data[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Матрицы должны быть одного размера");
        }

        T[][] result = (T[][]) new Number[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = (T) Double.valueOf(data[i][j].doubleValue() - other.data[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (columns != other.rows) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно быть равно числу строк второй матрицы");
        }

        T[][] result = (T[][]) new Number[rows][other.columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                result[i][j] = (T) Double.valueOf(0);
                for (int k = 0; k < columns; k++) {
                    result[i][j] = (T) Double.valueOf(result[i][j].doubleValue() + data[i][k].doubleValue() * other.data[k][j].doubleValue());
                }
            }
        }
        return new Matrix<>(result);
    }

    public void print() {
        for (T[] row : data) {
            for (T value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
