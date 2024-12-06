package ru.mirea.practice.s00000026.task3;

import java.util.Iterator;

public final class TestCustomIterator {

    private TestCustomIterator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(12);
        list.add(34);

        System.out.println("Элементы списка (с помощью foreach):");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Элементы списка (с помощью итератора):");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
