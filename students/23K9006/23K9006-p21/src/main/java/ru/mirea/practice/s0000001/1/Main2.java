package ru.mirea.practice.s0000001;

abstract class Main2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);

        System.out.println("Элемент по индексу 2: " + genericIntArray.get(2));
        genericIntArray.set(2, 10);
        System.out.println("Обновленный элемент по индексу 2: " + genericIntArray.get(2));
        System.out.println("Размер массива: " + genericIntArray.size());

        String[] stringArray = {"A", "B", "C"};
        GenericArray<String> genericStringArray = new GenericArray<>(stringArray);

        System.out.println("Элемент по индексу 0: " + genericStringArray.get(0));
        genericStringArray.set(0, "Z");
        System.out.println("Обновленный элемент по индексу 0: " + genericStringArray.get(0));
        System.out.println("Размер массива: " + genericStringArray.size());
    }
}
