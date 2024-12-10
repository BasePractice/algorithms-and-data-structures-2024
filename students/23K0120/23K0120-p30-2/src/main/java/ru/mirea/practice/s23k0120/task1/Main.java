package ru.mirea.practice.s23k0120.task1;

public abstract class Main {
    public static void main(String[] args) {
        IntegerBinarySearchTree integerSearch = new IntegerBinarySearchTree();
        int[] array = {5, 4, 2, 1, 3, 10, 9, 7, 8, 11, 12};
        for (int i : array) {
            integerSearch.insert(i);
        }
        System.out.println(integerSearch);
        integerSearch.delete(10);
        System.out.println(integerSearch);
    }
}
