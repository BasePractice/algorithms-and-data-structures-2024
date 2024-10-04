package ru.mirea.practice.s0000001.n4;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        double[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] data2 = {{7, 8, 9}, {10, 11, 12}};
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        matrix1.print();
        System.out.println();

        Matrix sum = matrix1.add(matrix2);
        sum.print();
        System.out.println();

        Matrix multipliedByNumber = matrix1.multiplyByNumber(2);
        multipliedByNumber.print();
        System.out.println();

        double[][] data3 = {{1, 2}, {3, 4}, {5, 6}};
        Matrix matrix3 = new Matrix(data3);
        Matrix product = matrix1.multiply(matrix3);
        product.print();
    }
}