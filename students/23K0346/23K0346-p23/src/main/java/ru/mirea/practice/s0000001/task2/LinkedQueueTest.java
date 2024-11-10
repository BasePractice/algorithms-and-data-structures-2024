package ru.mirea.practice.s0000001.task2;

public abstract class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        System.out.println(queue.size());

        queue.clear();
        System.out.println(queue.isEmpty());
    }
}

