package ru.mirea.practice.s23f0011;

public abstract class Tester {
    public static void main(String[] args) {
        // Тест для Triple
        Triple<Integer, ExampleAnimal, String> triple = new Triple<>(1, new ExampleAnimal(), "Пример");
        triple.printTypes();

        // Тест для MinMax
        Integer[] numbers = {1, 3, 5, 7, 9};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Минимум: " + minMax.min());
        System.out.println("Максимум: " + minMax.max());

        // Тест для Calculator
        System.out.println("Сумма: " + Calculator.sum(10, 20.5));
        System.out.println("Произведение: " + Calculator.multiply(10, 2.5));
        System.out.println("Деление: " + Calculator.divide(10, 2.5));
        System.out.println("Разность: " + Calculator.subtract(10, 2.5));

        // Тест для Matrix
        Double[][] matrixData1 = {{1.0, 2.0}, {3.0, 4.0}};
        Double[][] matrixData2 = {{5.0, 6.0}, {7.0, 8.0}};
        Matrix<Double> matrix1 = new Matrix<>(matrixData1);
        Matrix<Double> matrix2 = new Matrix<>(matrixData2);

        System.out.println("Результат сложения матриц:");
        matrix1.add(matrix2).printMatrix();

        System.out.println("Результат умножения матриц:");
        matrix1.multiply(matrix2).printMatrix();
    }
}
