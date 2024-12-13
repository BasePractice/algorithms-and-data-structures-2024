package ru.mirea.practice.s0000001.num1;

public abstract class Main {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 2;

        Matrix m1 = new Matrix(rows, cols);
        Matrix m2 = new Matrix(rows, cols);

        double[][] data1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] data2 = {{5.0, 6.0}, {7.0, 8.0}};

        m1.setData(data1);
        m2.setData(data2);

        System.out.println("Матрица 1:");
        m1.print();
        System.out.println("Матрица 2:");
        m2.print();

        Matrix sum = m1.add(m2);
        System.out.println("Сумма:");
        sum.print();

        Matrix product = m1.multiplyByScalar(2);
        System.out.println("Умножение на скаляр (2):");
        product.print();

        Matrix result = m1.multiply(m2);
        System.out.println("Результат умножения матриц:");
        result.print();
    }
}
