package ru.mirea.practice.s230k754.lab11.task2;

public abstract class AbsQueue extends LinkQueue {

    public AbsQueue(int capacity) {
        super(capacity);
    }

    @Override
    public abstract int size();

    @Override
    public abstract boolean isEmpty();

}
