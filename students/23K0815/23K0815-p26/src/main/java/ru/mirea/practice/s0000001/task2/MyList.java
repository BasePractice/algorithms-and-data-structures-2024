package ru.mirea.practice.s0000001.task2;

interface MyList<E> {

    void add(E element);

    E get(int index);

    int size();

    MyIterator<E> iterator();
}
