package ru.mirea.practice.s23K0135;

public abstract class Program3 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        int sr = sum / array.length;
        System.out.print("Сумма: " + sum + " Среднее: " + sr);
    }
}
