package ru.mirea.practice.s23f0011.task2;

public abstract class Tester {
    public static void main(String[] args) {
        // Тест LinkedQueue
        Queue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        System.out.println(linkedQueue.element()); // 1
        System.out.println(linkedQueue.dequeue()); // 1
        System.out.println(linkedQueue.size());    // 2
        linkedQueue.clear();
        System.out.println(linkedQueue.isEmpty()); // true

        // Тест ArrayQueue
        Queue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        System.out.println(arrayQueue.element()); // 1
        System.out.println(arrayQueue.dequeue()); // 1
        System.out.println(arrayQueue.size());    // 2
        arrayQueue.clear();
        System.out.println(arrayQueue.isEmpty()); // true
    }
}

