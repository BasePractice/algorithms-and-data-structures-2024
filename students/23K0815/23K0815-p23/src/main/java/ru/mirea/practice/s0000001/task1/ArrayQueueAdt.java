package ru.mirea.practice.s0000001.task1;

public class ArrayQueueAdt {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueueAdt(int capacity) {
        elements = new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Добавить элемент в очередь
    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Первый элемент в очереди
    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[head];
    }

    // Удалить и вернуть первый элемент
    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    // Текущий размер очереди
    public int size() {
        return size;
    }

    // Является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Удалить все элементы
    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
// Тесты для классов
