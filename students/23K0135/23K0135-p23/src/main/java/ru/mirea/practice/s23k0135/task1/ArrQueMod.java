package ru.mirea.practice.s23k0135.task1;

public abstract class ArrQueMod {
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;
    private static Object[] elements = new Object[10];

    public static void enqueue(Object element) {
        assert element != null : "Element cannot be null";
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object element() {
        assert size > 0 : "Queue is empty";
        return elements[head];
    }

    public static Object dequeue() {
        assert size > 0 : "Queue is empty";
        Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        Object ans = result;
        size--;
        return ans;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}
