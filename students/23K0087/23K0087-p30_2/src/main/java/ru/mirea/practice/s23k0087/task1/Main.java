package ru.mirea.practice.s23k0087.task1;


public abstract class Main {
    public static void main(String[] args) {
        IntegerBinarySearchTree integerSearch = new IntegerBinarySearchTree();
        int[] array = {11, 10, 1, 3, 5, 63, 32, 2, 23, 4};
        for (int i : array) {
            integerSearch.insert(i);
        }
        System.out.println(integerSearch);
        integerSearch.delete(10);
        System.out.println(integerSearch);
    }
}
