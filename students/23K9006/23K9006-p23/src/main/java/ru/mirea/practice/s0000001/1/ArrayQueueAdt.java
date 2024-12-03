package ru.mirea.practice.s0000001;

public class ArrayQueueAdt {
    private Object[] elements = new Object[10];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public static void enqueue(ArrayQueueAdt queue, Object element) {
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public static Object element(ArrayQueueAdt queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.head];
    }

    public static Object dequeue(ArrayQueueAdt queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        final Object result = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return result;
    }

    public static int size(ArrayQueueAdt queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueAdt queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueAdt queue) {
        queue.elements = new Object[10];
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }

    private static void ensureCapacity(ArrayQueueAdt queue, int capacity) {
        if (capacity > queue.elements.length) {
            Object[] newArray = new Object[2 * queue.elements.length];
            for (int i = 0; i < queue.size; i++) {
                newArray[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newArray;
            queue.head = 0;
            queue.tail = queue.size;
        }
    }
}
