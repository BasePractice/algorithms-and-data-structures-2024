package ru.mirea.practice.s23k0505.task4;

public final class Five {

    private Five() {

    }

    public static void main(String[] args) {
        Integer[][] matrix1Data = {{1, 2, 3}, {4, 5, 6}};
        Integer[][] matrix2Data = {{7, 8, 9}, {10, 11, 12}};

        Matrix<Integer> matrix1 = new Matrix<>(matrix1Data);
        Matrix<Integer> matrix2 = new Matrix<>(matrix2Data);

        Matrix<Double> sumMatrix = matrix1.add(matrix2);
        System.out.println("Sum of matrices:");
        sumMatrix.print();

        Integer[][] matrix3Data = {{1, 2}, {3, 4}, {5, 6}};
        Matrix<Integer> matrix3 = new Matrix<>(matrix3Data);

        Matrix<Double> productMatrix = matrix1.multiply(matrix3);
        System.out.println("Product of matrices:");
        productMatrix.print();
    }

}
