package ru.mirea.practice.u23k1158.t1.t2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
public class MyList<E> implements Iterable<E> {
    private Object[] elements;
    private int size;
    public MyList() {
        elements = new Object[10];
        size = 0;
    }
    public boolean add(E e) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = e;
        return true;
    }
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        return (E) elements[index];
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) {
                return true;
            }
        }
        return false;
    }
    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }
    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }
    // Реализация собственного итератора
    private class MyIterator implements Iterator<E> {
        private int cursor = 0; // Указатель текущей позиции
        private boolean canRemove = false; // Можно ли удалить элемент
        @Override
        public boolean hasNext() {
            return cursor < size;
        }
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Элементов больше нет");
            }
            canRemove = true;
            return (E) elements[cursor++];
        }
        @Override
        public void remove() {
            if (!canRemove) {
                throw new IllegalStateException("Удаление невозможно");
            }
            System.arraycopy(elements, cursor, elements, cursor - 1, size - cursor);
            elements[--size] = null; // Уменьшаем размер и обнуляем последний элемент
            cursor--;
            canRemove = false;
        }
    }
}
