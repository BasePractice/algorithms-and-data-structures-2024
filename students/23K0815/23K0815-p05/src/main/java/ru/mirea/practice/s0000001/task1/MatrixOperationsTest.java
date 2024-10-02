package ru.mirea.practice.s0000001.task1;

public final class MatrixOperationsTest {

    private MatrixOperationsTest() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static void main(String[] args) {
        final double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        final double[][] data2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        final MatrixOperations matrix1 = new MatrixOperations(data1);
        final MatrixOperations matrix2 = new MatrixOperations(data2);

        displayMatrix("Matrix 1:", matrix1);
        displayMatrix("Matrix 2:", matrix2);
        displayMatrix("Matrix 1 + Matrix 2:", matrix1.add(matrix2));
        displayMatrix("Matrix 1 * 2:", matrix1.multiplyByScalar(2));
        displayMatrix("Matrix 1 * Matrix 2:", matrix1.multiply(matrix2));
    }

    private static void displayMatrix(String message, MatrixOperations matrix) {
        System.out.println(message);
        matrix.print();
    }
}