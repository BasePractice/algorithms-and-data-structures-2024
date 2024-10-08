package ru.mirea.practice.s23K0135;

public class Ex4 {
    private double[][] data;
    private int rows;
    private int cols;

    public Ex4(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public void setElement(int row, int col, double value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            data[row][col] = value;
        } else {
            throw new IndexOutOfBoundsException("Неверный номер строки или столбца");
        }
    }

    public Ex4 add(Ex4 other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы разного размера");
        }

        Ex4 result = new Ex4(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Ex4 multiplyByScalar(double scalar) {
        Ex4 result = new Ex4(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.printf("%10.2f ", data[i][j]);
            }
            System.out.println();
        }
    }

    public Ex4 multiply(Ex4 other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Матрицы несовместимы для умножения");
        }

        Ex4 result = new Ex4(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Ex4 matrix1 = new Ex4(2, 2);
        matrix1.setElement(0, 0, 1.0);
        matrix1.setElement(0, 1, 2.0);
        matrix1.setElement(1, 0, 3.0);
        matrix1.setElement(1, 1, 4.0);

        Ex4 matrix2 = new Ex4(2, 2);
        matrix2.setElement(0, 0, 5.0);
        matrix2.setElement(0, 1, 6.0);
        matrix2.setElement(1, 0, 7.0);
        matrix2.setElement(1, 1, 8.0);

        Ex4 sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();

        Ex4 scalarMult = matrix1.multiplyByScalar(2.0);
        System.out.println("Скалярное произведение:");
        scalarMult.print();

        Ex4 product = matrix1.multiply(matrix2);
        System.out.println("Произведение матриц:");
        product.print();
    }
}
