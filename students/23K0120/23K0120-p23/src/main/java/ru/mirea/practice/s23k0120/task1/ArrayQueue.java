package ru.mirea.practice.s23k0120.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayQueue<T> implements ArrayQueueAdt<T> {
    private final int size;
    private final List<T> array;
    private int indexFront;
    private int indexRear;

    ArrayQueue(Collection<T> collection) {
        array = new ArrayList<>(collection);
        this.size = collection.size();
        indexFront = 0;
        indexRear = this.size - 1;
    }

    ArrayQueue(int size) {
        array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add(i, null);
        }
        indexFront = 0;
        indexRear = -1;
        this.size = size;
    }

    @Override
    public void enqueue(T element) {
        indexRear += 1;
        if (indexRear == size) {
            indexRear = 0;
        }
        array.set(indexRear, element);
    }

    @Override
    public T dequeue() {
        T element;
        if (isEmpty()) {
            element = null;
        } else {
            element = array.get(indexFront);
            if (indexRear == indexFront) {
                indexRear -= 1;
            }
            if (indexRear == -1) {
                indexRear = size - 1;
            }
            indexFront += 1;
            if (indexFront == size) {
                indexFront = 0;
            }
        }
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return indexRear == -1;
    }

    @Override
    public void clear() {
        array.clear();
    }

    @Override
    public T front() {
        return array.get(0);
    }

    @Override
    public T rear() {
        return array.get(indexRear);
    }

    @Override
    public String toString() {
        ArrayList<T> tempList = new ArrayList<>(size);
        if (indexRear == -1) {
            return "[]";
        } else if (indexFront < indexRear) {
            for (int i = indexFront; i < indexRear + 1; i++) {
                tempList.add(array.get(i));
            }
        } else {
            for (int i = indexFront; i < size; i++) {
                tempList.add(array.get(i));
            }
            for (int i = 0; i < indexRear + 1; i++) {
                if (i == indexFront) {
                    break;
                }
                tempList.add(array.get(i));
            }
        }
        return tempList.toString();
    }
}
