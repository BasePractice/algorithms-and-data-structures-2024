package ru.mirea.practice.s0000001.task4;

public final class MatrixTester {

    private MatrixTester() {

    }

    public static void main(String[] args) {
        // Создаем две матрицы 2x2
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

        // Выводим матрицы на экран
        System.out.println("Первая матрица:");
        matrix1.printMatrix();

        System.out.println("Вторая матрица:");
        matrix2.printMatrix();

        // Сложение матриц
        System.out.println("Сложение матриц:");
        Matrix sumMatrix = matrix1.add(matrix2);
        if (sumMatrix != null) {
            sumMatrix.printMatrix();
        }

        // Умножение матрицы на число
        System.out.println("Умножение первой матрицы на 2:");
        Matrix scaledMatrix = matrix1.multiplyByNumber(2);
        scaledMatrix.printMatrix();

        // Умножение матриц
        System.out.println("Умножение матриц:");
        Matrix multipliedMatrix = matrix1.multiply(matrix2);
        if (multipliedMatrix != null) {
            multipliedMatrix.printMatrix();
        }
    }
}