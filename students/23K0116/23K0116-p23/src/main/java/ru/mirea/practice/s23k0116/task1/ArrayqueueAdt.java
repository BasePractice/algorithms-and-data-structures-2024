package ru.mirea.practice.s23k0116.task1;

public class ArrayqueueAdt {
    private Object[] queue;
    private int size;
    private int head;
    private int tail;

    public ArrayqueueAdt(int capacity) {
        queue = new Object[capacity];
        size = head = tail = 0;
    }

    public static void enqueue(ArrayqueueAdt q, Object element) {
        assert element != null : "Элемент не может быть null";
        ensureCapacity(q, q.size + 1);
        q.queue[q.tail] = element;
        q.tail = (q.tail + 1) % q.queue.length;
        q.size++;
    }

    public static Object element(ArrayqueueAdt q) {
        assert q.size > 0 : "Очередь пуста";
        return q.queue[q.head];
    }

    public static Object dequeue(ArrayqueueAdt q) {
        assert q.size > 0 : "Очередь пуста";
        final Object result = q.queue[q.head];
        q.queue[q.head] = null;
        q.head = (q.head + 1) % q.queue.length;
        q.size--;
        return result;
    }

    public static int size(ArrayqueueAdt q) {
        return q.size;
    }

    public static boolean isEmpty(ArrayqueueAdt q) {
        return q.size == 0;
    }

    public static void clear(ArrayqueueAdt q) {
        q.queue = new Object[q.queue.length];
        q.size = q.head = q.tail = 0;
    }

    private static void ensureCapacity(ArrayqueueAdt q, int capacity) {
        if (capacity > q.queue.length) {
            Object[] newQueue = new Object[q.queue.length * 2];
            for (int i = 0; i < q.size; i++) {
                newQueue[i] = q.queue[(q.head + i) % q.queue.length];
            }
            q.queue = newQueue;
            q.head = 0;
            q.tail = q.size;
        }
    }
}
