package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class Main {  // Сделано final, чтобы нельзя было создать экземпляр

    private Main() {  // Приватный конструктор для предотвращения создания экземпляров
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            Triple<Integer, Dog, String> triple = new Triple<>(10, new Dog(), "Hello");
            triple.printClassNames();

            Integer[] intArray = {3, 5, 1, 7};
            MinMax<Integer> minMax = new MinMax<>(intArray);
            System.out.println("Min: " + minMax.findMin());
            System.out.println("Max: " + minMax.findMax());

            System.out.println("Sum: " + Calculator.sum(10, 20.5));
            System.out.println("Multiply: " + Calculator.multiply(5, 4.0));
            System.out.println("Subtract: " + Calculator.subtract(10.5, 5));
            try {
                System.out.println("Divide: " + Calculator.divide(10, 0));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            Integer[][] matrixData1 = {{1, 2}, {3, 4}};
            Integer[][] matrixData2 = {{5, 6}, {7, 8}};
            Matrix<Integer> matrix1 = new Matrix<>(matrixData1);
            Matrix<Integer> matrix2 = new Matrix<>(matrixData2);

            matrix1.printMatrix();
            System.out.println("After adding:");
            Matrix<Integer> resultMatrix = matrix1.add(matrix2);
            resultMatrix.printMatrix();
        }
    }
}
