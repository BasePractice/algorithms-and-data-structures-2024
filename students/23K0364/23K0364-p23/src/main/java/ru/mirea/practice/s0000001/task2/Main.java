package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        Queue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        System.out.println("ArrayQueue first element: " + arrayQueue.element());  // 1
        System.out.println("ArrayQueue dequeued element: " + arrayQueue.dequeue());  // 1
        System.out.println("ArrayQueue size after dequeue: " + arrayQueue.size());  // 1
        arrayQueue.clear();
        System.out.println("ArrayQueue is empty after clear? " + arrayQueue.isEmpty());  // true

        Queue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(10);
        linkedQueue.enqueue(20);
        System.out.println("LinkedQueue first element: " + linkedQueue.element());  // 10
        System.out.println("LinkedQueue dequeued element: " + linkedQueue.dequeue());  // 10
        System.out.println("LinkedQueue size after dequeue: " + linkedQueue.size());  // 1
        linkedQueue.clear();
        System.out.println("LinkedQueue is empty after clear? " + linkedQueue.isEmpty());  // true
    }
}

