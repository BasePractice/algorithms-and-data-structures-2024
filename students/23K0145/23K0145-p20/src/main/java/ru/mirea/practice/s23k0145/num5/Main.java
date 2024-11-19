package ru.mirea.practice.s23k0145.num5;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Double[][] data1 = {
                {2.0, 3.0},
                {4.0, 5.0}
        };

        Double[][] data2 = {
                {1.0, 3.0},
                {2.0, 4.0}
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
