package ru.mirea.practice.lab1;

public abstract class Proj6 {
    public static void harm(int a) {
        if (a <= 0) {
            System.out.println("Введено натуральное число меньше единицы!");
            System.exit(-1);
        }
        for (int i = 1; i < a + 1; i++) {
            System.out.format("%.2f\n", (float) 1 / i);
        }
    }

    public static void main(String[] args) {
        harm(10);
    }
}
