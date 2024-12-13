package ru.mirea.practice.s0000001.task2and3;

public class MyTypeList<T> implements List<T> {
    private T[] ar;
    private int size;
    private int maxSize = 16;

    public MyTypeList() {
        ar = (T[]) new Object[maxSize];
        size = 0;
    }

    @Override
    public void add(T a) {
        if (size >= maxSize) {
            T[] temp = (T[]) new Object[maxSize * 2];
            System.arraycopy(ar, 0, temp, 0, maxSize);
            ar = temp;
            maxSize *= 2;
        } else {
            ar[size] = a;
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int ask) {
        return ask <= size ? ar[ask] : null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
