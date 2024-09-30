package ru.mirea.practice.s23k0362.task2;

public abstract class MatrixTest {
    public static void main(String[] args) {

        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        Matrix matrix1 = new Matrix(data1);
        final Matrix matrix2 = new Matrix(data2);

        System.out.println("Matrix 1:");
        matrix1.print();

        System.out.println("Matrix 2:");
        matrix2.print();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Matrix 1 + Matrix 2:");
        sum.print();

        Matrix scalarMultiplication = matrix1.multiplyByScalar(2);
        System.out.println("Matrix 1 * 2:");
        scalarMultiplication.print();

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Matrix 1 * Matrix 2:");
        product.print();
    }
}
