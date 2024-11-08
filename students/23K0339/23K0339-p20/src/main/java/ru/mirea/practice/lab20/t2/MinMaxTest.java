package ru.mirea.practice.lab20.t2;

public abstract class MinMaxTest {
    public static void main(String[] args) {
        Integer[] intArray = {12, 3, 45, 7, 23};
        MinMax<Integer> minMax = new MinMax<>(intArray);


        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
    }
}

