package ru.mirea.practice.s0000001.task1;

public abstract class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements;
    private static int head;
    private static int tail;
    private static int size;

    static {
        elements = new Object[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Добавить элемент в очередь
    public static void enqueue(Object element) {
        // Предусловие: Очередь не переполнена
        if (size == elements.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
        // Постусловие: Элемент добавлен
    }

    // Первый элемент в очереди
    public static Object element() {
        // Предусловие: Очередь не пуста
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[head];
        // Постусловие: Возвращает первый элемент без удаления
    }

    // Удалить и вернуть первый элемент
    public static Object dequeue() {
        // Предусловие: Очередь не пуста
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        Object result = elements[head];
        head = (head + 1) % elements.length;
        size--;
        // Постусловие: Первый элемент удален и возвращен
        return result;
    }

    // Текущий размер очереди
    public static int size() {
        // Постусловие: Возвращает количество элементов
        return size;
    }

    // Является ли очередь пустой
    public static boolean isEmpty() {
        // Постусловие: Возвращает true, если очередь пуста
        return size == 0;
    }

    // Удалить все элементы
    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
        // Постусловие: Очередь пуста
    }
}

// Класс ArrayQueueAdt