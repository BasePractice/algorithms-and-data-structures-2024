package ru.mirea.practice.lab20.t4;

public abstract class MatrixTest {
    public static void main(String[] args) {
        Integer[][] matrixData1 = {
            {1, 2},
            {3, 4}
        };
        Integer[][] matrixData2 = {
            {5, 6},
            {7, 8}
        };


        final Matrix<Integer> matrix1 = new Matrix<>(matrixData1);
        final Matrix<Integer> matrix2 = new Matrix<>(matrixData2);

        System.out.println("Matrix1");
        matrix1.printMatrix();
        System.out.println(" ");
        System.out.println("Matrix2:");
        matrix2.printMatrix();
        System.out.println(" ");
        System.out.println("Matrix1 + Matrix2:");
        matrix1.add(matrix2).printMatrix();
        System.out.println(" ");
        System.out.println("Matrix1 * Matrix2:");
        matrix1.multiply(matrix2).printMatrix();
    }
}

