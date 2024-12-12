package ru.mirea.practice.s23k0145.lab2;

import java.util.Collection;
import java.util.LinkedList;

public class DynamicQueue<T> extends BaseQueue<T> {

    public DynamicQueue(Collection<T> items) {
        elements = new LinkedList<>(items);
        currentSize = items.size();
    }

    public DynamicQueue() {
        elements = new LinkedList<>();
        currentSize = 0;
    }

    @Override
    public void add(T element) {
        elements.add(currentSize, element);
        currentSize++;
    }

    @Override
    public T remove() {
        if (isQueueEmpty()) {
            throw new IllegalStateException("Очередь пуста!");
        }
        T element = elements.remove(0);
        currentSize--;
        return element;
    }

    public static void main(String[] args) {
        DynamicQueue<Integer> queue = new DynamicQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Текущий размер: " + queue.getSize());
        System.out.println("Удалённый элемент: " + queue.remove());
        System.out.println("Очередь пуста? " + queue.isQueueEmpty());
    }
}
