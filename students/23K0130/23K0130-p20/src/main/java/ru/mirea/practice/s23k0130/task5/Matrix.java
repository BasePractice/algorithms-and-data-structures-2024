package ru.mirea.practice.s23k0130.task5;

public class Matrix<T extends Number> {
    private final T[][] data;
    private final int rows;
    private final int columns;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Matrix<Double> add(Matrix<T> other) {
        checkDimensions(other);

        Double[][] result = new Double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = this.data[i][j].doubleValue() + other.data[i][j].doubleValue();
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<Double> multiply(Matrix<T> other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Размеры не совпадают");
        }

        Double[][] result = new Double[this.rows][other.columns];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < this.columns; k++) {
                    result[i][j] += this.data[i][k].doubleValue() * other.data[k][j].doubleValue();
                }
            }
        }
        return new Matrix<>(result);
    }

    private void checkDimensions(Matrix<T> other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            throw new IllegalArgumentException("Размерность должна совпадать");
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}