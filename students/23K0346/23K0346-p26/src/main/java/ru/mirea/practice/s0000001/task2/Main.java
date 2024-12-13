package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

        MyListIterator<String> iterator = new MyListIterator<>(myList);

        System.out.println("Перебор элементов с использованием MyListIterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

