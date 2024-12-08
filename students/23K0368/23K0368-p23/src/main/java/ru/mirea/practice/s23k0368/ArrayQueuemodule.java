package ru.mirea.practice.s23k0368;

public abstract class ArrayQueuemodule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    // Добавить элемент в очередь
    public static void enqueue(Object element) {
        assert element != null : "element cannot be null";
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Вернуть первый элемент в очереди
    public static Object element() {
        assert size > 0 : "Queue is empty";
        return elements[head];
    }

    // Удалить и вернуть первый элемент в очереди
    public static Object dequeue() {
        assert size > 0 : "Queue is empty";
        final Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    // Текущий размер очереди
    public static int size() {
        return size;
    }

    // Проверка, пустая ли очередь
    public static boolean isEmpty() {
        return size == 0;
    }

    // Очистить очередь
    public static void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    // Увеличить емкость массива при необходимости
    private static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }

        Object[] newElements = new Object[2 * elements.length];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
        tail = size;
    }
}
