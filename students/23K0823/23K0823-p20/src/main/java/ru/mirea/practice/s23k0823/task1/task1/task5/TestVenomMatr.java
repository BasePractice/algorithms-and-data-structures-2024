package ru.mirea.practice.s23k0823.task1.task1.task5;

public abstract class TestVenomMatr {
    public static void main(String[] args) {
        Matrix<Double> matrix1 = new Matrix<>(2, 2);
        matrix1.set(0, 0, 1.0);
        matrix1.set(0, 1, 2.0);
        matrix1.set(1, 0, 3.0);
        matrix1.set(1, 1, 4.0);

        Matrix<Double> matrix2 = new Matrix<>(2, 2);
        matrix2.set(0, 0, 5.0);
        matrix2.set(0, 1, 6.0);
        matrix2.set(1, 0, 7.0);
        matrix2.set(1, 1, 8.0);

        Matrix<Double> result = matrix1.add(matrix2);
        System.out.println("Результат сложения:");
        result.print();

        Matrix<Double> result2 = matrix1.multiply(matrix2);
        System.out.println("Результат умножения:");
        result2.print();
    }
}
