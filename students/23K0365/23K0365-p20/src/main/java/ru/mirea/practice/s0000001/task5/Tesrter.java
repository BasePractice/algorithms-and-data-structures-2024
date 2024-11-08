package ru.mirea.practice.s0000001.task5;

public abstract class Tesrter {
    public static void main(String[] args) {
        Double[][] arr1 = {{1.2, 12.5, 53.1, 89.8}, {1.2, 12.5, 53.1, 89.8}};
        Matrix<Double> a = new Matrix<>(arr1);
        Double[][] arr2 = {{2., .236, 22.1, 52.6}, {1.5, 235., 15., 0.}};
        Matrix<Double> b = new Matrix<>(arr2);
        Matrix<Double> c = a.add(b);
        c.printMatrix();
        c.subtract(b).printMatrix();
        //c.multiply(a).printMatrix();
    }
}
