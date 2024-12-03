package ru.mirea.practice.s0000001.task5;

public class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix<T> add(Matrix<T> other) {
        int lines = matrix.length;
        int stolb = matrix[0].length;
        T[][] result = (T[][]) new Number[lines][stolb];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < stolb; j++) {
                result[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() + other.getMatrix()[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        int lines = matrix.length;
        int stolb = matrix[0].length;
        T[][] result = (T[][]) new Number[lines][stolb];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < stolb; j++) {
                result[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() - other.getMatrix()[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        int lines = matrix.length;
        int stolb = other.getMatrix()[0].length;
        T[][] result = (T[][]) new Number[lines][stolb];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < stolb; j++) {
                result[i][j] = (T) Double.valueOf(0);
                for (int k = 0; k < stolb; k++) {
                    result[i][j] = (T) Double.valueOf(result[i][j].doubleValue()
                        + matrix[i][k].doubleValue() * other.getMatrix()[k][j].doubleValue());
                }
            }
        }
        return new Matrix<>(result);
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
