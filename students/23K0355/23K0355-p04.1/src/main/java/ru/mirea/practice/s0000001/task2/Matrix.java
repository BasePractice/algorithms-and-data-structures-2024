package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public class Matrix {

    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public void inputMatrix(Scanner scanner) {
        System.out.println("Введите элементы матрицы размером " + rows + "x" + cols + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = scanner.nextDouble();
            }
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны быть одинакового размера для сложения.");
        }
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiplyByNumber(double number) {
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.data[i][j] = this.data[i][j] * number;
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
        }
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            int cols = scanner.nextInt();

            Matrix matrix1 = new Matrix(rows, cols);
            System.out.println("Введите данные для первой матрицы:");
            matrix1.inputMatrix(scanner);

            Matrix matrix2 = new Matrix(rows, cols);
            System.out.println("Введите данные для второй матрицы:");
            matrix2.inputMatrix(scanner);

            System.out.print("Введите число, на которое хотите умножить первую матрицу: ");
            double number = scanner.nextDouble();

            Matrix sum = matrix1.add(matrix2);
            final Matrix product = matrix1.multiplyByNumber(number); // Объявление как final
            final Matrix multiplied = matrix1.multiply(matrix2); // Объявление как final

            System.out.println("Сумма матриц:");
            sum.print();

            System.out.println("Умножение первой матрицы на число " + number + ":");
            product.print();

            System.out.println("Умножение матриц:");
            multiplied.print();
        } finally {
            scanner.close();
        }
    }
}