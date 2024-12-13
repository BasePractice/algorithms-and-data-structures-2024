package ru.mirea.practice.s0000001.num2;

public class ArrayQueue extends AbstractQueue {
    private int[] arr = new int[10];
    private int head = 0;
    private int tail = 0;

    public void enqueue(int x) {
        if (sz == arr.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        arr[tail] = x;
        tail = (tail + 1) % arr.length;
        sz++;
    }

    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return arr[head];
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        int res = arr[head];
        head = (head + 1) % arr.length;
        sz--;
        return res;
    }
}
