package ru.mirea.practice.s230k754.lab3.taskmathrand.task1;

public final class Task1 {
    private Task1() {}

    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }
    }
}
