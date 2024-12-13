package ru.mirea.practice.s00000026.task2;

import java.util.Iterator;

public final class TestCustomIterator {

    private TestCustomIterator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(11);

        System.out.println("Элементы списка:");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
