package ru.mirea.practice.s23k0145.num5;

public class Matrix<T extends Number> {
    private T[][] data;
    private int rows;
    private int cols;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public T get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, T value) {
        data[row][col] = value;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры.");
        }

        T[][] result = (T[][]) new Number[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = (T) Double.valueOf(data[i][j].doubleValue() + other.data[i][j].doubleValue());
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно совпадать с числом строк второй матрицы.");
        }

        T[][] result = (T[][]) new Number[rows][other.cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0.0;
                for (int k = 0; k < cols; k++) {
                    sum += data[i][k].doubleValue() * other.data[k][j].doubleValue();
                }
                result[i][j] = (T) Double.valueOf(sum);
            }
        }

        return new Matrix<>(result);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
