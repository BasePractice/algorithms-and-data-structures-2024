package ru.mirea.practice.s0000001.prog5;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = (T[][]) new Number[rows][cols];
    }

    public Matrix(T[][] matrix) {
        this.rows = matrix.length;
        this.cols = matrix[0].length;
        this.matrix = matrix.clone();
    }

    // Геттеры
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public T get(int row, int col) {
        return matrix[row][col];
    }

    // Сеттеры
    public void set(int row, int col, T value) {
        matrix[row][col] = value;
    }

    // Сложение матриц
    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковый размер");
        }
        Matrix<T> result = new Matrix<>(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(i, j, (T) Double.valueOf(get(i, j).doubleValue() + other.get(i, j).doubleValue()));
            }
        }
        return result;
    }

    // Умножение матриц
    public Matrix<T> multiply(Matrix<T> other) {
        if (cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы");
        }
        Matrix<T> result = new Matrix<>(rows, other.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                T sum = (T) Double.valueOf(0);
                for (int k = 0; k < cols; k++) {
                    sum = (T) Double.valueOf(sum.doubleValue() + get(i, k).doubleValue() * other.get(k, j).doubleValue());
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }

    // Вывод матрицы
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
