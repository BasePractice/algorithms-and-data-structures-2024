package ru.mirea.practice.task1.task2;

public class MyList<T> {
    private T[] arr;

    @SuppressWarnings("unchecked")
    public MyList(int size) {
        this.arr = (T[]) new Object[size];
    }

    public void add(T el, int idx) {
        if (idx >= 0 && idx < arr.length) {
            arr[idx] = el;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public java.util.Iterator<T> iterator() {
        return new MyListIterator<>(arr);
    }
}
