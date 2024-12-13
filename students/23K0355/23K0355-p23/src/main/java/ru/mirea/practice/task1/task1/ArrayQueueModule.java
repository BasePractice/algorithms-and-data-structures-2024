package ru.mirea.practice.task1.task1;

public final class ArrayQueueModule {
    private static int[] q;
    private static int h = 0;
    private static int t = 0;
    private static int s = 0;
    private static final int CAP = 10;

    private ArrayQueueModule() {
        throw new UnsupportedOperationException("Невозможно создать экземпляр утилитного класса");
    }

    static {
        q = new int[CAP];
    }

    public static void enqueue(int el) {
        if (s == CAP) {
            throw new IllegalStateException("Очередь полна");
        }
        q[t] = el;
        t = (t + 1) % CAP;
        s++;
    }

    public static int dequeue() {
        if (s == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int el = q[h];
        h = (h + 1) % CAP;
        s--;
        return el;
    }

    public static int element() {
        if (s == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return q[h];
    }

    public static int size() {
        return s;
    }

    public static boolean isEmpty() {
        return s == 0;
    }

    public static void clear() {
        h = t = s = 0;
    }
}
