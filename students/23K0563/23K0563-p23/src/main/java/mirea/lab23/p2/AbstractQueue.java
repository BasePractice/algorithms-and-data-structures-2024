package mirea.lab23.p2;

public abstract class AbstractQueue<T> implements Queue<T> {
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
