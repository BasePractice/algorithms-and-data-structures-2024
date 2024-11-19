package ru.mirea.practice.s0000001;

public final class Main2 {

    private Main2() {
        // Private constructor to prevent instantiation
    }

    public static void main(String[] args) {
        Double[][] matrix1Data = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        NumericMatrix matrix1 = new NumericMatrix(matrix1Data);
        System.out.println("Matrix 1:");
        matrix1.display();

        final Double[][] matrix2Data = {
                {9.0, 8.0, 7.0},
                {6.0, 5.0, 4.0},
                {3.0, 2.0, 1.0}
        };
        NumericMatrix matrix2 = new NumericMatrix(matrix2Data);
        System.out.println("Matrix 2:");
        matrix2.display();

        Matrix<Double> sumMatrix = matrix1.add(matrix2);
        System.out.println("Sum of matrices:");
        sumMatrix.display();

        NumericMatrix matrix3 = new NumericMatrix(new Double[][]{
                {1.0, 2.0},
                {3.0, 4.0},
                {5.0, 6.0}
        });
        System.out.println("Matrix 3:");
        matrix3.display();

        Matrix<Double> productMatrix = matrix1.multiply(matrix3);
        System.out.println("Product of Matrix 1 and Matrix 3:");
        productMatrix.display();
    }
}
