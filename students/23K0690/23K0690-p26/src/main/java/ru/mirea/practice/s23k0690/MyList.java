package ru.mirea.practice.s23k0690;

interface MyList<T> {

    void add(T element);

    T get(int index);

    int size();

    MyListIterator<T> iterator();
}
