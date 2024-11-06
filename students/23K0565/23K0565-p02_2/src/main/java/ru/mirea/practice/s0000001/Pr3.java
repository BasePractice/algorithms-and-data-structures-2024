package ru.mirea.practice.s0000001;

public abstract class Pr3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = 0;
        for (int num : arr) {
            s += num;
        }
        int avg = s / arr.length;
        System.out.print("Сумма: " + s + " Среднее: " + avg);
    }
}
