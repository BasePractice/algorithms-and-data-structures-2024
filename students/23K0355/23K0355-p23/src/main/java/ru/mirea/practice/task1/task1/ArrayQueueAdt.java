package ru.mirea.practice.task1.task1;

public class ArrayQueueAdt {
    private int[] q;
    private int h;
    private int t;
    private int s;
    private static final int CAP = 10;

    public ArrayQueueAdt() {
        q = new int[CAP];
        h = t = s = 0;
    }

    public void enqueue(int e) {
        if (s == CAP) {
            throw new IllegalStateException("Очередь заполнена");
        }
        q[t] = e;
        t = (t + 1) % CAP;
        s++;
    }

    public int dequeue() {
        if (s == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int e = q[h];
        h = (h + 1) % CAP;
        s--;
        return e;
    }

    public int element() {
        if (s == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return q[h];
    }

    public int size() {
        return s;
    }

    public boolean isEmpty() {
        return s == 0;
    }

    public void clear() {
        h = t = s = 0;
    }
}
