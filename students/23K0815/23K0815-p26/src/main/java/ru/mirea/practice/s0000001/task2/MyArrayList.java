package ru.mirea.practice.s0000001.task2;

class MyArrayList<E> implements MyList<E> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10]; // Начальный размер массива
        size = 0;
    }

    @Override
    public void add(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyIterator<>(this);
    }
}