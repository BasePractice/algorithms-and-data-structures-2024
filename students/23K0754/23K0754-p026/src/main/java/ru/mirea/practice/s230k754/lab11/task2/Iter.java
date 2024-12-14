package ru.mirea.practice.s230k754.lab11.task2;

import java.util.List;

public class Iter<L> {

    private final List<L> list;
    private int index = 0;

    public Iter(List<L> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return index < list.size();
    }

    public L next() {
        return list.get(index++);
    }
}
