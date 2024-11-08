package ru.mirea.practice.s0000001.task1;

class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (this.matrix.length != other.matrix.length || this.matrix[0].length != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
        T[][] result = (T[][]) new Number[this.matrix.length][this.matrix[0].length];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                result[i][j] = (T) Double.valueOf(this.matrix[i][j].doubleValue() + other.matrix[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
