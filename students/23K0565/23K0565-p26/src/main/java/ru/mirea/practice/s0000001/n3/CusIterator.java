package ru.mirea.practice.s0000001.n3;

import java.util.Iterator;

public class CusIterator<T> implements Iterator<T> {
    private CusList<T> lst;
    private int idx;

    public CusIterator(CusList<T> lst) {
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
