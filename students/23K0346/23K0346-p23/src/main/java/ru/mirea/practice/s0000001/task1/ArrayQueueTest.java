package ru.mirea.practice.s0000001.task1;

public abstract class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // 1
        System.out.println(queue.element());  // 2
        System.out.println(queue.size());     // 2

        queue.clear();
        System.out.println(queue.isEmpty());  // true
    }
}

