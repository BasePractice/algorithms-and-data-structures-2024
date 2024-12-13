package ru.mirea.practice.s0000001;

abstract class Main3 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};
        ArrayElementGetter<Integer> intGetter = new ArrayElementGetter<>(numbers);
        System.out.println("Элемент по индексу 2: " + intGetter.getElementByIndex(2));

        String[] words = {"apple", "banana", "cherry"};
        ArrayElementGetter<String> stringGetter = new ArrayElementGetter<>(words);
        System.out.println("Элемент по индексу 1: " + stringGetter.getElementByIndex(1));
    }
}
