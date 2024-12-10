package ru.mirea.practice.s23k0140.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Перый");
        myList.add("Второй");
        myList.add("Третий");

        ListIterator<String> iterator = new ListIterator<>(myList);

        System.out.println("Перебор элементов:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}