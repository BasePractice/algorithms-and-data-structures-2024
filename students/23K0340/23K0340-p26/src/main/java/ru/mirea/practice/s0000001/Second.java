package ru.mirea.practice.s0000001;

import java.util.Iterator;
import java.util.List;

public class Second {
    public static class CustomIterator<T> implements Iterator<T> {
        private int cursor;
        private List<T> list;

        public CustomIterator(List<T> list) {
            this.cursor = 0;
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return cursor + 2 < list.size();
        }

        @Override
        public T next() {
            this.cursor++;
            return this.list.get(cursor);
        }

        @Override
        public void remove() {
            this.list.remove(cursor);
            this.cursor--;
        }
    }
}
