package ru.mirea.practice.s23k0116.task1;

public abstract class QueueTest {
    public static void main(String[] args) {
        // Тест ArrayQueueModule
        ArrayqueueModule.enqueue(10);
        ArrayqueueModule.enqueue(20);
        System.out.println(ArrayqueueModule.dequeue()); // 10
        System.out.println(ArrayqueueModule.size());    // 1

        // Тест ArrayQueueADT
        ArrayqueueAdt queueAdt = new ArrayqueueAdt(5);
        ArrayqueueAdt.enqueue(queueAdt, 30);
        ArrayqueueAdt.enqueue(queueAdt, 40);
        System.out.println(ArrayqueueAdt.dequeue(queueAdt)); // 30
        System.out.println(ArrayqueueAdt.size(queueAdt));    // 1

        // Тест ArrayQueue
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue.dequeue()); // 50
        System.out.println(queue.size());    // 1
    }
}
