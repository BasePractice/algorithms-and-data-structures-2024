package ru.mirea.practice.s0000002.practice41.matrix;

public abstract class Main {
    public static void main(String[] args) {
        // Создание  двух  матриц
        double[][] matrix1Data = {{1, 2}, {3, 4}};
        Matrix matrix1 = new Matrix(matrix1Data);
        matrix1.print();
        System.out.println();

        double[][] matrix2Data = {{5, 6}, {7, 8}};
        Matrix matrix2 = new Matrix(matrix2Data);
        matrix2.print();
        System.out.println();

        // Сложение  матриц
        Matrix sum = matrix1.add(matrix2);
        System.out.println("Сумма  матриц:");
        sum.print();
        System.out.println();

        //  Умножение  матрицы  на  число
        Matrix multiplied = matrix1.multiply(2);
        System.out.println("Умножение  матрицы  на  2:");
        multiplied.print();
        System.out.println();

        // Умножение  матриц  (по  желанию)
        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Произведение  матриц:");
        product.print();
    }
}
