package ru.mirea.practice.s23k0130.task5;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Integer[][] matrix1Data = {{1, 5, 1}, {9, 8, 8}};
        Integer[][] matrix2Data = {{2, 7, 2}, {6, 6, 4}};

        Matrix<Integer> matrix1 = new Matrix<>(matrix1Data);
        Matrix<Integer> matrix2 = new Matrix<>(matrix2Data);

        Matrix<Double> sumMatrix = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sumMatrix.print();

        Integer[][] matrix3Data = {{2, 2}, {3, 3}, {4, 4}};
        Matrix<Integer> matrix3 = new Matrix<>(matrix3Data);

        Matrix<Double> productMatrix = matrix1.multiply(matrix3);
        System.out.println("Произведение матриц:");
        productMatrix.print();
    }

}
