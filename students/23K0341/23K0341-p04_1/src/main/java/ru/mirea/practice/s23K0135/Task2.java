package ru.mirea.practice.s23K0135;

/**
 * Создать класс Матрица. Класс должен иметь следующие поля: 1)
 * двумерный массив вещественных чисел; 2) количество строк и столбцов в
 * матрице. Класс должен иметь следующие методы: 1) сложение с другой
 * матрицей; 2) умножение на число; 3) вывод на печать; 4) умножение матриц - по
 * желанию.
 */

public abstract class Task2 {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(2);
        Matrix matrixB = new Matrix(2, 2);
        Matrix matrixC = new Matrix(2, 1);

        int i = 0;
        for (int row = 0; row < matrixA.n; row++) {
            for (int col = 0; col < matrixA.m; col++) {
                matrixA.data[row][col] = i;
                i++;
            }
        }

        for (int row = 0; row < matrixB.n; row++) {
            for (int col = 0; col < matrixB.m; col++) {
                matrixB.data[row][col] = ((row + col) % 2 == 0) ? 1 : 0;
            }
        }

        int k = 0;
        for (int row = 0; row < matrixC.n; row++) {
            for (int col = 0; col < matrixC.m; col++) {
                matrixC.data[row][col] = 1 - k;
                k++;
            }
        }

        System.out.println("Matrix A");
        System.out.println(matrixA);
        System.out.println("Matrix B");
        System.out.println(matrixB);
        System.out.println("Matrix C");
        System.out.println(matrixC);

        System.out.println("A + B");
        System.out.println(matrixB.add(matrixA));
        System.out.println("A * n");
        System.out.println(matrixA.mult(10));
        System.out.println("B * C");
        System.out.println(matrixB.mult(matrixC));
    }


    static class Matrix {
        int[][] data;
        int n;
        int m;


        public Matrix(int n, int m) {
            this.data = new int[n][m];
            this.n = n;
            this.m = m;
        }

        public Matrix(int n) {
            this(n, n);
        }

        public Matrix add(Matrix other) {
            if (this.n != other.n || this.m != other.m) {
                throw new RuntimeException("Unable to add matrices of different sizes.");
            }

            Matrix res = new Matrix(this.n, this.m);
            for (int row = 0; row < res.n; row++) {
                for (int col = 0; col < res.m; col++) {
                    res.data[row][col] = this.data[row][col] + other.data[row][col];
                }
            }

            return res;
        }

        public Matrix mult(int n) {
            Matrix res = new Matrix(this.n, this.m);
            for (int row = 0; row < res.n; row++) {
                for (int col = 0; col < res.m; col++) {
                    res.data[row][col] = this.data[row][col] * n;
                }
            }

            return res;
        }

        public Matrix mult(Matrix other) {
            if (this.m != other.n) {
                throw new RuntimeException("Unable to multiply matrices: " + "A="
                        + this.n + "x" + this.m + " and " + "B=" + other.n + "x" + other.m + ".");
            }

            Matrix res = new Matrix(this.n, other.m);

            for (int rowA = 0; rowA < this.n; rowA++) {
                for (int colB = 0; colB < other.m; colB++) {
                    for (int colA = 0; colA < this.m; colA++) {
                        {
                            res.data[rowA][colB] += this.data[rowA][colA] * other.data[rowA][colB];
                        }
                    }
                }
            }

            return res;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            builder.append("[ ");
            for (int row = 0; row < this.n; row++) {
                for (int col = 0; col < this.m; col++) {
                    builder.append(this.data[row][col]).append(col + 1 < this.m ? ", " : " ");
                }
                builder.append("]\n").append(row + 1 < this.n ? "[ " : "");
            }

            return builder.toString();
        }
    }
}
