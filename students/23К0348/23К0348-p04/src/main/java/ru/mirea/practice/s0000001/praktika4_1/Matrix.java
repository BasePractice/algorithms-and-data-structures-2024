package ru.mirea.practice.s0000001.praktika4_1;

class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new double[rows][cols];
    }

    public void setData(double[][] data) {
        this.data = data;
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions must match");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiplyByScalar(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setData(new double[][]{{1.0, 2.0}, {3.0, 4.0}});

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setData(new double[][]{{5.0, 6.0}, {7.0, 8.0}});

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();

        Matrix scalarProduct = matrix1.multiplyByScalar(2);
        System.out.println("Умножение матрицы на скаляр:");
        scalarProduct.print();
    }
}