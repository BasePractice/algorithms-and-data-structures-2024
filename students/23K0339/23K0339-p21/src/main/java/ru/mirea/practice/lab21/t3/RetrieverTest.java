package ru.mirea.practice.lab21.t3;

abstract class RetrieverTest {
    public static void main(String[] args) {
        String[] stringArray = {"буль", "ба", "завр"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Элемент массива строк по индексу 1: "
            + ArrayElementRetriever.getElement(stringArray, 1));
        System.out.println("Элемент массива чисел по индексу 3: "
            + ArrayElementRetriever.getElement(intArray, 3));
    }
}
