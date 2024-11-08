package ru.mirea.practice.s0000001.prog5;

public abstract class Main {
    public static void main(String[] args) {
        Integer[][] intMatrix1 = {{1, 2}, {3, 4}};
        Matrix<Integer> matrix1 = new Matrix<>(intMatrix1);
        Integer[][] intMatrix2 = {{5, 6}, {7, 8}};
        Matrix<Integer> matrix2 = new Matrix<>(intMatrix2);

        Matrix<Integer> sumMatrix = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sumMatrix.print();

        Matrix<Integer> productMatrix = matrix1.multiply(matrix2);
        System.out.println("Произведение матриц:");
        productMatrix.print();

        Double[][] doubleMatrix1 = {{1.5, 2.0}, {3.5, 4.0}};
        Matrix<Double> matrix3 = new Matrix<>(doubleMatrix1);
        Double[][] doubleMatrix2 = {{5.0, 6.0}, {7.0, 8.0}};
        Matrix<Double> matrix4 = new Matrix<>(doubleMatrix2);

        Matrix<Double> productMatrixDouble = matrix3.multiply(matrix4);
        System.out.println("Произведение матриц (Double):");
        productMatrixDouble.print();
    }
}
