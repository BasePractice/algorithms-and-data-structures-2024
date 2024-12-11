package ru.mirea.practice.s0000001.task1;

public abstract class ArrayQueueAdTtest {
    public static void main(String[] args) {
        ArrayQueueAdT queue = new ArrayQueueAdT();

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

