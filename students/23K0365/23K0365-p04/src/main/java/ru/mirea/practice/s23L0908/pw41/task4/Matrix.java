package ru.mirea.practice.s23L0908.pw41.task4;

public class Matrix {
    private int[][] array;
    private int lines;
    private int collumn;

    public Matrix(int[][] array) {
        this.array = array;
        if (array.length != 0) {
            this.lines = array.length;
            this.collumn = array[0].length;
        }
    }

    public void summary(Matrix arr) {
        if (this.lines == arr.lines && this.collumn == arr.collumn) {
            for (int i = 0; i < this.lines; i++) {
                for (int j = 0; j < this.collumn; j++) {
                    this.array[i][j] += arr.array[i][j];
                }
            }
        }
    }

    public void multiply(int a) {
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.collumn; j++) {
                this.array[i][j] *= a;
            }
        }
    }

    public void toPrint() {
        for (int i = 0; i < this.lines; i++) {
            for (int j = 0; j < this.collumn; j++) {
                System.out.print(this.array[i][j] + " ");
                if (j == this.collumn - 1) {
                    System.out.println();
                }
            }
        }
    }

    public Matrix multTwo(Matrix b) {
        if (this.array[0].length == b.array.length) {
            int[][] e = new int[this.array.length][b.array[0].length];
            Matrix c = new Matrix(e);
            for (int i = 0; i < c.array.length; i++) {
                for (int j = 0; j < c.array[0].length; j++) {
                    c.array[i][j] = 0;
                    for (int k = 0; k < this.array[0].length; k++) {
                        c.array[i][j] += this.array[i][k] * b.array[k][j];
                    }
                }
            }
            return c;
        } else {
            System.out.println("ERORR!!!");
            return this;
        }
    }

    public Matrix(int[][] array, int lines, int collumn) {
        this.array = array;
        this.lines = lines;
        this.collumn = collumn;
    }
}
