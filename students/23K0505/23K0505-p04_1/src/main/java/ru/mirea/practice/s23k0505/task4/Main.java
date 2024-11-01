package ru.mirea.practice.s23k0505.task4;

public abstract class Main {
    public static void main(String[] args) {
        Matrix matr1 = new Matrix(new float[][]{{1, 2, 3}, {3, 4, 5}});

        Matrix matr2 = new Matrix(new float[][]{{1, 1, 1}, {2, 2, 2}});

        System.out.printf("rows = %d columns = %d\n", matr1.getRows(), matr1.getColumns());

        System.out.println(matr1);
        System.out.println(matr2);

        System.out.println(Matrix.add(matr2, matr1));
        matr1.add(new Matrix(new float[][]{{1, 1, 1}, {-10, -10, -10}}));
        System.out.println(matr1);

        Matrix matr3 = new Matrix(new float[][]{{1, 2}, {3, 4}});
        Matrix matr4 = new Matrix(new float[][]{{1, 1}});
        Matrix matr5 = new Matrix(new float[][]{{1}, {0}});

        System.out.println(matr4.size());
        System.out.println(matr3.multiplyLeft(matr4));
        System.out.println(matr5.multiplyLeft(matr3));

        System.out.println(Matrix.multiply(matr4, matr5));
    }
}
