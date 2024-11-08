package ru.mirea.practice.s0000001;

import java.util.Arrays;

class NumericMatrix extends Matrix<Double> {

    public NumericMatrix(Double[][] elements) {
        super(elements);
    }

    @Override
    public Matrix<Double> add(Matrix<Double> other) {
        if (this.elements.length != other.elements.length || this.elements[0].length != other.elements[0].length) {
            throw new IllegalArgumentException("Размерности матриц должны совпадать для сложения.");
        }

        Double[][] result = new Double[this.elements.length][this.elements[0].length];
        for (int i = 0; i < this.elements.length; i++) {
            for (int j = 0; j < this.elements[i].length; j++) {
                result[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return new NumericMatrix(result);
    }

    @Override
    public Matrix<Double> multiply(Matrix<Double> other) {
        if (this.elements[0].length != other.elements.length) {
            throw new IllegalArgumentException("Число столбцов первой матрицы должно равняться числу строк второй матрицы.");
        }

        Double[][] result = new Double[this.elements.length][other.elements[0].length];
        for (int i = 0; i < this.elements.length; i++) {
            for (int j = 0; j < other.elements[0].length; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < this.elements[0].length; k++) {
                    result[i][j] += this.elements[i][k] * other.elements[k][j];
                }
            }
        }
        return new NumericMatrix(result);
    }

    @Override
    public void display() {
        for (Double[] row : elements) {
            System.out.println(Arrays.toString(row));
        }
    }
}
