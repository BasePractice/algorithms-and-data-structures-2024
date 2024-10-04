package ru.mirea.practice.s0000001.task4;

public abstract class MatrixTest {
    public static void main(String[] args) {
        double[][] data1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double[][] data2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        Matrix matrix1 = new Matrix(data1);

        System.out.println("Матрица 1:");
        matrix1.print();

        Matrix matrix2 = new Matrix(data2);

        System.out.println("Матрица 2:");
        matrix2.print();

        System.out.println("Сложение матриц:");
        Matrix sum = matrix1.add(matrix2);
        sum.print();

        System.out.println("Умножение матрицы 1 на число 2:");
        Matrix multipliedByScalar = matrix1.multiply(2);
        multipliedByScalar.print();

        System.out.println("Умножение матриц:");
        double[][] data3 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        Matrix matrix3 = new Matrix(data3);
        Matrix product = matrix1.multiply(matrix3);
        product.print();
    }
}