package ru.mirea.practice.s23k0368.prog2;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        MyIterator<Integer> iterator = new MyIterator<>(list);

        System.out.println("Итерация по списку");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        iterator.remove();
        System.out.println("Список после удаления последнего элемента");
        System.out.println(list);
    }
}
