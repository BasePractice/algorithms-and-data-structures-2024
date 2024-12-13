package ru.mirea.practice.s23k0690;

class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public void add(T element) {
        if (size >= elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyListIterator<T> iterator() {
        return new MyListIterator<>(this);
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }
}
