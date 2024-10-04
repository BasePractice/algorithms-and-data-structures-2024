package ru.mirea.practice.s23f0011;

public class Task4 {
    private final double[][] matrix;
    private final int rows;
    private final int cols;

    public Task4(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new double[rows][cols];
    }

    public static void main(String[] args) {
        Task4 matrix1 = new Task4(2, 3);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(0, 2, 3);
        matrix1.set(1, 0, 4);
        matrix1.set(1, 1, 5);
        matrix1.set(1, 2, 6);

        Task4 matrix2 = new Task4(2, 3);
        matrix2.set(0, 0, 7);
        matrix2.set(0, 1, 8);
        matrix2.set(0, 2, 9);
        matrix2.set(1, 0, 10);
        matrix2.set(1, 1, 11);
        matrix2.set(1, 2, 12);

        Task4 sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();

        Task4 multiplied = matrix1.multiply(2);
        System.out.println("Матрица, умноженная на 2:");
        multiplied.print();
    }

    public Task4 add(Task4 other) {
        if (rows != other.rows || cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры");
        }
        Task4 result = new Task4(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }
        return result;
    }

    public Task4 multiply(double scalar) {
        Task4 result = new Task4(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void set(int row, int col, double value) {
        matrix[row][col] = value;
    }
}