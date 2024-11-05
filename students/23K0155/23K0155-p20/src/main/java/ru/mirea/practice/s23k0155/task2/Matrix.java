package ru.mirea.practice.s23k0155.task2;

class Matrix<T extends Number> {
    private T[][] data;

    public Matrix(T[][] data) {
        this.data = data;
    }

    public Matrix<T> add(Matrix<T> other) {
        int rows = data.length;
        int cols = data[0].length;
        T[][] result = (T[][]) new Number[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = (T) Double.valueOf(data[i][j].doubleValue() + other.data[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        int rows = data.length;
        int cols = data[0].length;
        T[][] result = (T[][]) new Number[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = (T) Double.valueOf(data[i][j].doubleValue() - other.data[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public void print() {
        for (T[] row : data) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}