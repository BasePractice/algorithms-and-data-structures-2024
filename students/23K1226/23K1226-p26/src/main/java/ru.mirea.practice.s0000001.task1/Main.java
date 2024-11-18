package ru.mirea.practice.s0000001.task1;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public final class Main {

    private Main() {
        // Приватный конструктор для предотвращения создания экземпляра утилитного класса
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            invertArrayUsingStack(array);

            System.out.println("Инвертированный массив:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            CustomList<Integer> customList = new CustomList<>();
            customList.add(1);
            customList.add(2);
            customList.add(3);
            System.out.println("Элементы CustomList с использованием итератора:");
            CustomIterator<Integer> iterator = customList.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
    }

    public static void invertArrayUsingStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    static class CustomList<T> implements Iterable<T> {
        private List<T> elements;

        public CustomList() {
            elements = new ArrayList<>();
        }

        public void add(T element) {
            elements.add(element);
        }

        @Override
        public CustomIterator<T> iterator() {
            return new CustomIterator<>(elements);
        }
    }

    static class CustomIterator<T> implements Iterator<T> {
        private List<T> list;
        private int index = 0;

        public CustomIterator(List<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            return list.get(index++);
        }
    }
}
