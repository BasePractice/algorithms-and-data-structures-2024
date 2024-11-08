package ru.mirea.practice.s23k0155.task2;

public abstract class Test {
    public static void main(String[] args) {
        Integer[][] matrixData1 = {{1, 2}, {3, 4}};
        Integer[][] matrixData2 = {{5, 6}, {7, 8}};
        Matrix<Integer> matrix1 = new Matrix<>(matrixData1);
        Matrix<Integer> matrix2 = new Matrix<>(matrixData2);

        Matrix<Integer> resultAdd = matrix1.add(matrix2);
        System.out.println("Matrix Addition:");
        resultAdd.print();

        Matrix<Integer> resultSubtract = matrix1.subtract(matrix2);
        System.out.println("Matrix Subtraction:");
        resultSubtract.print();
    }
}