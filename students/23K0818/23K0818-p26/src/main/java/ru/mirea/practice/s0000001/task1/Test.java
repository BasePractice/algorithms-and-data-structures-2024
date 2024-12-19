package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;

abstract class Test {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        Iterator iterator = new Iterator();
        iterator.next(al);
        iterator.next(al);
        iterator.next(al);
        System.out.println(iterator.hasNext(al));

    }
}
