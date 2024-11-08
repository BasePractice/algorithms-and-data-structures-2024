package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        Integer[] numbers = {3, 5, 1, 4, 2};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
    }
}

