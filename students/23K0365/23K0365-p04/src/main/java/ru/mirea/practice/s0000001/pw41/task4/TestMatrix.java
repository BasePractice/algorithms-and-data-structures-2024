package ru.mirea.practice.s0000001.pw41.task4;

public abstract class TestMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        Matrix a = new Matrix(arr);
        Matrix b = new Matrix(arr);
        b.multiply(-1);
        a.summary(b);
        a.toPrint();
        System.out.println();
        System.out.println();
        System.out.println();
        int[][] arr2 = {{1,2},{3,4},{5,6}};
        Matrix c = new Matrix(arr2);
        a.multTwo(c).toPrint();
        System.out.println();
        System.out.println("that's work!>:]");
    }
}
