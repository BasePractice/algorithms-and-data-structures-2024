package ru.mirea.practice.s23k0135.task2and3;

public abstract class Test {
    public static void main(String[] args) {
        Integer[] arr = {5, 6, 8, 3, 2, 1};
        Task2and3<Integer> array = new Task2and3<>(arr);
        System.out.println(array);
    }
}
