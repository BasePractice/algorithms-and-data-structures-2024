package ru.mirea.practice.s23k0087.tasks2and3;

import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {
    private Node<T> first;
    private final int size;

    public CustomList() {
        first = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void add(T elem) {
        Node<T> node = new Node<>(elem);
        if (first == null) {
            first = node;
        } else {
            Node<T> curr = first;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(node);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<>(this);
    }
}
