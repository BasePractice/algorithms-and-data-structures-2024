package ru.mirea.practice.s23f0011.task1;

import java.util.List;

import static ru.mirea.practice.s23f0011.task1.Example.convertArrayToList;

public abstract class Tester {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        List<Integer> numberList = convertArrayToList(numbers);
        System.out.println(numberList);

        Integer[] emptyArray = new Integer[10];
    }
}
