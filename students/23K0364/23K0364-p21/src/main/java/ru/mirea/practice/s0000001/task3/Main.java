package ru.mirea.practice.s0000001.task3;

public abstract class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> integerArray = new GenericArray<>(intArray);

        System.out.println("Массив целых чисел:");
        for (Integer element : integerArray.getArray()) {
            System.out.println(element);
        }

        System.out.println("Элемент по индексу 2: " + integerArray.getElementByIndex(2));

        String[] stringArray = {"apple", "banana", "cherry"};
        GenericArray<String> stringGenericArray = new GenericArray<>(stringArray);

        System.out.println("\nМассив строк:");
        for (String element : stringGenericArray.getArray()) {
            System.out.println(element);
        }

        System.out.println("Элемент по индексу 1: " + stringGenericArray.getElementByIndex(1));
    }
}

