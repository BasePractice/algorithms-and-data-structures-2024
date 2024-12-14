package ru.mirea.practice.s23k0087.task1;

public final class ArrayQueueAdt {

    private Object[] queue = new Object[16];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public static void enqueue(ArrayQueueAdt queueAdt, Object element) {
        ensureCapacity(queueAdt, queueAdt.size + 1);
        queueAdt.queue[queueAdt.tail] = element;
        queueAdt.tail = (queueAdt.tail + 1) % queueAdt.queue.length;
        queueAdt.size++;
    }

    public static Object getFirstElement(ArrayQueueAdt queueAdt) {
        return queueAdt.queue[queueAdt.head];
    }

    public static Object dequeue(ArrayQueueAdt queueAdt) {
        Object result;
        result = queueAdt.queue[queueAdt.head];
        queueAdt.queue[queueAdt.head] = null;
        queueAdt.head = (queueAdt.head + 1) % queueAdt.queue.length;
        queueAdt.size--;
        return result;
    }

    public static int size(ArrayQueueAdt queueAdt) {
        return queueAdt.size;
    }

    public static boolean isEmpty(ArrayQueueAdt queueAdt) {
        return queueAdt.size == 0;
    }

    public static void clear(ArrayQueueAdt queueAdt) {
        queueAdt.queue = new Object[16];
        queueAdt.head = queueAdt.tail = queueAdt.size = 0;
    }

    private static void ensureCapacity(ArrayQueueAdt queueAdt, int capacity) {
        if (capacity > queueAdt.queue.length) {
            Object[] newQueue = new Object[queueAdt.queue.length * 2];
            for (int i = 0; i < queueAdt.size; i++) {
                newQueue[i] = queueAdt.queue[(queueAdt.head + i) % queueAdt.queue.length];
            }
            queueAdt.queue = newQueue;
            queueAdt.head = 0;
            queueAdt.tail = queueAdt.size;
        }
    }
}
