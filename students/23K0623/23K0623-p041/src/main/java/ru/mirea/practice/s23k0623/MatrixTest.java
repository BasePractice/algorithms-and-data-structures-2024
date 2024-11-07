package ru.mirea.practice.s23k0623;

public abstract class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setElement(0, 0, 1);
        matrix1.setElement(0, 1, 2);
        matrix1.setElement(1, 0, 3);
        matrix1.setElement(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setElement(0, 0, 5);
        matrix2.setElement(0, 1, 6);
        matrix2.setElement(1, 0, 7);
        matrix2.setElement(1, 1, 8);

        Matrix sum = matrix1.add(matrix2);
        if (sum != null) {
            System.out.println("Результат сложения матриц:");
            sum.print();
        }

        Matrix multipliedByNumber = matrix1.multiplyByNumber(2);
        System.out.println("Матрица, умноженная на 2:");
        multipliedByNumber.print();

        Matrix multiplied = matrix1.multiplyMatrix(matrix2);
        if (multiplied != null) {
            System.out.println("Результат умножения матриц:");
            multiplied.print();
        }

    }
}
