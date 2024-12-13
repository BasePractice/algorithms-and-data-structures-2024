package ru.mirea.practice.s23k0130.task1;

public final class ArrayQueueADt {

    private Object[] queue = new Object[16];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public static void enqueue(ArrayQueueADt queueadt, Object element) {
        ensureCapacity(queueadt, queueadt.size + 1);
        queueadt.queue[queueadt.tail] = element;
        queueadt.tail = (queueadt.tail + 1) % queueadt.queue.length;
        queueadt.size++;
    }

    public static Object element(ArrayQueueADt queueadt) {
        return queueadt.queue[queueadt.head];
    }

    public static Object dequeue(ArrayQueueADt queueadt) {
        Object result;
        result = queueadt.queue[queueadt.head];
        queueadt.queue[queueadt.head] = null;
        queueadt.head = (queueadt.head + 1) % queueadt.queue.length;
        queueadt.size--;
        return result;
    }

    public static int size(ArrayQueueADt queueadt) {
        return queueadt.size;
    }

    public static boolean isEmpty(ArrayQueueADt queueadt) {
        return queueadt.size == 0;
    }

    public static void clear(ArrayQueueADt queueadt) {
        queueadt.queue = new Object[16];
        queueadt.head = queueadt.tail = queueadt.size = 0;
    }

    private static void ensureCapacity(ArrayQueueADt queueadt, int capacity) {
        if (capacity > queueadt.queue.length) {
            Object[] newQueue = new Object[queueadt.queue.length * 2];
            for (int i = 0; i < queueadt.size; i++) {
                newQueue[i] = queueadt.queue[(queueadt.head + i) % queueadt.queue.length];
            }
            queueadt.queue = newQueue;
            queueadt.head = 0;
            queueadt.tail = queueadt.size;
        }
    }
}