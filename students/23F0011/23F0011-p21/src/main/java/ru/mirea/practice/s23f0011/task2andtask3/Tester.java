package ru.mirea.practice.s23f0011.task2andtask3;

public abstract class Tester {
    public static void main(String[] args) {
        Integer[] arr = {5, 4, 3, 2, 1};
        Example<Integer> array = new Example<>(arr);
        System.out.println(array);
    }
}

