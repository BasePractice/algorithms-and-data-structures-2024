package ru.mirea.practice.s23l0908.task2;

@SuppressWarnings("unused")
public abstract class AbstractQueue implements Queue {
    // inv: size >= 0
    protected int size = 0;

    @Override
    public abstract void enqueue(Object elem);

    @Override
    public abstract Object element();

    @Override
    public abstract Object dequeue();

    @Override
    public abstract Object peek();

    @Override
    public abstract void push(Object elem);

    @Override
    public abstract Object remove();

    @Override
    public abstract Object get(int index);

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}


