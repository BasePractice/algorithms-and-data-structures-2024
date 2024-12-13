package ru.mirea.practice.s0000001.num2;

public interface MyList<T> {
    void add(T v);

    MyIterator<T> iter();
}
