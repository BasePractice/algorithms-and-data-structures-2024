package ru.mirea.practice.s23f0011;

class Matrix<T extends Number> {
    private final T[][] matrix;

    // Конструктор
    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    // Метод для получения матрицы
    public T[][] getMatrix() {
        return matrix;
    }

    // Метод для сложения матриц
    public Matrix<Double> add(Matrix<T> other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Double[][] result = new Double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = this.matrix[i][j].doubleValue() + other.matrix[i][j].doubleValue();
            }
        }
        return new Matrix<>(result);
    }

    // Метод для умножения матриц
    public Matrix<Double> multiply(Matrix<T> other) {
        int rows = matrix.length;
        int cols = other.matrix[0].length;
        int sumLength = matrix[0].length;
        Double[][] result = new Double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < sumLength; k++) {
                    result[i][j] += this.matrix[i][k].doubleValue() * other.matrix[k][j].doubleValue();
                }
            }
        }
        return new Matrix<>(result);
    }

    // Печать матрицы
    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
