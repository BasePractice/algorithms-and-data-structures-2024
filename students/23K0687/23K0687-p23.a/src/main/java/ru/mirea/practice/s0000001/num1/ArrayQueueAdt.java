package ru.mirea.practice.s0000001.num1;

public class ArrayQueueAdt {
    private int[] arr = new int[10];
    private int h = 0;
    private int t = 0;
    private int sz = 0;

    public void enqueue(int x) {
        if (sz == arr.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        arr[t] = x;
        t = (t + 1) % arr.length;
        sz++;
    }

    public int element() {
        if (sz == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return arr[h];
    }

    public int dequeue() {
        if (sz == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int res = arr[h];
        h = (h + 1) % arr.length;
        sz--;
        return res;
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return sz == 0;
    }

    public void clear() {
        h = 0;
        t = 0;
        sz = 0;
    }
}
