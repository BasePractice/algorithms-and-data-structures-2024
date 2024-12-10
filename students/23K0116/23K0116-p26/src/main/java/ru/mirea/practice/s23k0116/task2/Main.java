package ru.mirea.practice.s23k0116.task2;

import java.util.Iterator;

public abstract class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(7);
        myList.add(2);
        myList.add(3);
        myList.add(8);

        System.out.println("Итерация через итератор:");
        Iterator<Integer> iterator = myList.iterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
            if (value == 2) {
                iterator.remove(); // Удаляем элемент 2
            }
        }

        System.out.println("\nОставшиеся элементы:");
        for (Integer value : myList) {
            System.out.println(value);
        }
    }
}
