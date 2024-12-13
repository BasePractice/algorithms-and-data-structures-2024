package mirea.lab26.p2;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private Object[] array;
    private int size;

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return get(index++);
            }
            return null;
        }

    }

    public MyList(int startsize) {
        size = startsize;
        array = new Object[startsize];
    }

    public void expand() {
        Object[] temp = new Object[array.length + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public void append(T t) {
        if (size == array.length) {
            expand();
        }
        array[size++] = t;
    }

    public T get(int i) {
        if (i > 0 || i < size) {
            return (T) array[i];
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}
