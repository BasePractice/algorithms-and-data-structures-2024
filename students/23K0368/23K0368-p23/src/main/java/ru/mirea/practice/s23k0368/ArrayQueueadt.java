package ru.mirea.practice.s23k0368;

public class ArrayQueueadt {
    private Object[] elements;
    private int size;
    private int head;
    private int tail;

    public ArrayQueueadt() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public static void enqueue(ArrayQueueadt queue, Object element) {
        assert element != null : "element cannot be null";
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueadt queue) {
        assert queue.size > 0 : "Queue is empty";
        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueadt queue) {
        assert queue.size > 0 : "Queue is empty";
        final Object result = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return result;
    }

    public static int size(ArrayQueueadt queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueadt queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueadt queue) {
        queue.elements = new Object[10];
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }

    private static void ensureCapacity(ArrayQueueadt queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }

        Object[] newElements = new Object[2 * queue.elements.length];
        for (int i = 0; i < queue.size; i++) {
            newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
        }
        queue.elements = newElements;
        queue.head = 0;
        queue.tail = queue.size;
    }
}
