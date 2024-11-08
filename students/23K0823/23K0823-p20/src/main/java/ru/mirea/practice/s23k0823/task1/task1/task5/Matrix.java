package ru.mirea.practice.s23k0823.task1.task1.task5;

public class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(int rows, int cols) {
        matrix = (T[][]) new Number[rows][cols];
    }

    public void set(int row, int col, T value) {
        matrix[row][col] = value;
    }

    public T get(int row, int col) {
        return matrix[row][col];
    }

    public Matrix<T> add(Matrix<T> other) {
        if (matrix.length != other.matrix.length || matrix[0].length != other.matrix[0].length) {
            throw new RuntimeException("Матрицы должны иметь одинаковые размеры");
        }

        Matrix<T> result = new Matrix<>(matrix.length, matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result.set(i, j, (T) Double.valueOf(get(i, j).doubleValue() + other.get(i, j).doubleValue()));
            }
        }

        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (matrix[0].length != other.matrix.length) {
            throw new RuntimeException("Матрицы должны иметь совместимые размеры для умножения");
        }

        Matrix<T> result = new Matrix<>(matrix.length, other.matrix[0].length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < other.matrix[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    sum += get(i, k).doubleValue() * other.get(k, j).doubleValue();
                }
                result.set(i, j, (T) Double.valueOf(sum));
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(get(i, j) + " ");
            }
            System.out.println();
        }
    }
}