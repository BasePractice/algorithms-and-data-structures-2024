package ru.mirea.practice.s0000001.n2;

import java.util.Iterator;
import java.util.List;

public class CusIterator<T> implements Iterator<T> {
    private List<T> lst;
    private int idx;

    public CusIterator(List<T> lst) {
        this.lst = lst;
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx < lst.size();
    }

    @Override
    public T next() {
        return lst.get(idx++);
    }
}
//Upd
