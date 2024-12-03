package ru.mirea.practices0000001.task5;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Double[][] data1 = {
                {1.0, 2.0},
                {3.0, 4.0}
        };

        Double[][] data2 = {
                {5.0, 6.0},
                {7.0, 8.0}
        };

        Matrix<Double> matrix1 = new Matrix<>(data1);
        Matrix<Double> matrix2 = new Matrix<>(data2);

        Matrix<Double> sumMatrix = matrix1.add(matrix2);
        System.out.println("Результат сложения:");
        sumMatrix.print();

        Matrix<Double> productMatrix = matrix1.multiply(matrix2);
        System.out.println("Результат умножения:");
        productMatrix.print();
    }
}