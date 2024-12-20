package ru.mirea.practice.s0000001.num2;

public class MyArrayList<T> implements MyList<T> {
    private Object[] e = new Object[10];
    private int s = 0;

    public void add(T v) {
        if (s == e.length) {
            e = java.util.Arrays.copyOf(e, s * 2);
        }
        e[s++] = v;
    }

    public MyIterator<T> iter() {
        return new MyIteratorImpl();
    }

    private class MyIteratorImpl implements MyIterator<T> {
        private int i = 0;

        public boolean hasNext() {
            return i < s;
        }

        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return (T) e[i++];
        }
    }
}
