package ru.mirea.practice.s0000001;

import java.util.List;
import java.util.NoSuchElementException;

public class CustomListIterator<T> implements java.util.Iterator<T> {
    private final List<T> list;
    private int index;

    public CustomListIterator(List<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(index++);
    }

    @Override
    public void remove() {
        if (index == 0) {
            throw new IllegalStateException("next() should be called before remove()");
        }
        list.remove(--index);
    }

    public static void main(String[] args) {
        List<String> list = java.util.Arrays.asList("One", "Two", "Three", "Four");
        CustomListIterator<String> iterator = new CustomListIterator<>(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
