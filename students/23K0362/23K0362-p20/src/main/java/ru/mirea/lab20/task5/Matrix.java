package mirea.lab20.task5;

/*
5. Написать класс Matrix, на основе обобщенного типа,
реализовать операции с матрицами
 */

import java.util.Arrays;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int columns;

    @SuppressWarnings("unchecked")
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = (T[][]) new Number[rows][columns];
    }

    public void setValue(int row, int column, T value) {
        try {
            if (row >= this.rows || column >= this.columns) {
                throw new IllegalArgumentException("Must be input row < " + rows + ", and input column < " + columns);
            }
            this.matrix[row][column] = value;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public T getValue(int row, int column) {
        try {
            if (row >= this.rows || column >= this.columns) {
                throw new IllegalArgumentException("Must be input row < " + rows + ", and input column < " + columns);
            }
            return this.matrix[row][column];
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Matrix<T> add(Matrix<T> otherMatrix) {
        try {
            if (otherMatrix.rows != this.rows || otherMatrix.columns != this.columns) {
                throw new IllegalArgumentException("Matrices must have equal dimensions.");
            }
            Matrix<T> resultMatrix = new Matrix<>(this.rows, otherMatrix.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    resultMatrix.setValue(i, j, (T) Double.valueOf(this.matrix[i][j].doubleValue()
                            + otherMatrix.getValue(i, j).doubleValue()));
                }
            }
            return resultMatrix;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Matrix<T> divide(Matrix<T> otherMatrix) {
        try {
            if (otherMatrix.rows != this.rows || otherMatrix.columns != this.columns) {
                throw new IllegalArgumentException("Matrices must have equal dimensions.");
            }
            Matrix<T> resultMatrix = new Matrix<>(this.rows, otherMatrix.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    resultMatrix.setValue(i, j, (T) Double.valueOf(this.matrix[i][j].doubleValue()
                            - otherMatrix.getValue(i, j).doubleValue()));
                }
            }
            return resultMatrix;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Matrix<T> multiply(Matrix<T> otherMatrix) {
        if (this.columns != otherMatrix.rows) {
            throw new IllegalArgumentException("Matrices must have compatible dimensions for multiplication.");
        }

        Matrix<T> resultMatrix = new Matrix<>(this.rows, otherMatrix.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < otherMatrix.columns; j++) {
                double sum = 0;
                for (int k = 0; k < this.columns; k++) {
                    sum += this.getValue(i, k).doubleValue() * otherMatrix.getValue(k, j).doubleValue();
                }
                resultMatrix.setValue(i, j, (T) Double.valueOf(sum));
            }
        }
        return resultMatrix;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matrix);
    }
}
