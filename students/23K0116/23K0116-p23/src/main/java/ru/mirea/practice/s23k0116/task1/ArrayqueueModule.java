package ru.mirea.practice.s23k0116.task1;

public abstract class ArrayqueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] queue = new Object[DEFAULT_CAPACITY];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    // Добавить элемент в очередь
    public static void enqueue(Object element) {
        assert element != null : "Элемент не может быть null";
        ensureCapacity(size + 1);
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    // Первый элемент в очереди
    public static Object element() {
        assert size > 0 : "Очередь пуста";
        return queue[head];
    }

    // Удалить и вернуть первый элемент
    public static Object dequeue() {
        assert size > 0 : "Очередь пуста";
        final Object result = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
        size--;
        return result;
    }

    // Текущий размер очереди
    public static int size() {
        return size;
    }

    // Очередь пуста?
    public static boolean isEmpty() {
        return size == 0;
    }

    // Очистить очередь
    public static void clear() {
        queue = new Object[DEFAULT_CAPACITY];
        size = head = tail = 0;
    }

    // Обеспечить вместимость
    private static void ensureCapacity(int capacity) {
        if (capacity > queue.length) {
            Object[] newQueue = new Object[queue.length * 2];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(head + i) % queue.length];
            }
            queue = newQueue;
            head = 0;
            tail = size;
        }
    }
}
