package ru.mirea.practice.s0000001;

import java.util.List;
import java.util.NoSuchElementException;

public class Task2<T> implements java.util.Iterator<T> {
    private final List<T> list;
    private int currentIndex = 0;

    public Task2(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);
    }

    @Override
    public void remove() {
        if (currentIndex == 0 || currentIndex > list.size()) {
            throw new IllegalStateException();
        }
        list.remove(--currentIndex);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Task2<Integer> iterator = new Task2<>(list);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
