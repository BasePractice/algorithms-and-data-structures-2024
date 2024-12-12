package ru.mirea.practice.s23k0145.lab3;

public abstract class ArrayAccessor {

    public static <T> T fetchElement(T[] dataArray, int position) {
        if (position < 0 || position >= dataArray.length) {
            throw new IndexOutOfBoundsException("Недопустимый индекс: " + position);
        }
        return dataArray[position];
    }

    public static void main(String[] args) {
        String[] fruits = {"кузнечик", "бабочка", "собака"};
        System.out.println("Элемент по индексу 1: " + fetchElement(fruits, 1));

        Integer[] numbers = {42, 73, 64};
        System.out.println("Элемент по индексу 0: " + fetchElement(numbers, 0));
    }
}
