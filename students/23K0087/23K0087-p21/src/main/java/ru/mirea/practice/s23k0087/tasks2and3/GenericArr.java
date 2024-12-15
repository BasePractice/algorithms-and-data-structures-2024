package ru.mirea.practice.s23k0087.tasks2and3;

public class GenericArr<E> {
    private final E[] array;

    public GenericArr(E[] elements) {
        this.array = elements;
    }

    public E get(int index) {

        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
    }

    public void set(int index, E element) {
        if (index >= 0 && index < array.length) {
            array[index] = element;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
    }

    public E getElementByIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        return array[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        return array.length;
    }
}
