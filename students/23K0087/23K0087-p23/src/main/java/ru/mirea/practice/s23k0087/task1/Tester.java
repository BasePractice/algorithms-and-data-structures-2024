package ru.mirea.practice.s23k0087.task1;

public abstract class Tester {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(0);
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println("The first element: " + ArrayQueueModule.getFirstElement());
        ArrayQueueModule.dequeue();
        System.out.println("Current size: " + ArrayQueueModule.size());
        System.out.println("Queue is empty = " + ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println("Queue is empty = " + ArrayQueueModule.isEmpty());
        System.out.println();

        ArrayQueueAdt queueAdt = new ArrayQueueAdt();
        ArrayQueueAdt.enqueue(queueAdt, 10);
        ArrayQueueAdt.enqueue(queueAdt, 13);
        ArrayQueueAdt.enqueue(queueAdt, 23);
        System.out.println("The first element: " + ArrayQueueAdt.getFirstElement(queueAdt));
        ArrayQueueAdt.dequeue(queueAdt);
        System.out.println("Current size: " + ArrayQueueAdt.size(queueAdt));
        System.out.println("Queue is empty = " + ArrayQueueAdt.isEmpty(queueAdt));
        ArrayQueueAdt.clear(queueAdt);
        System.out.println("Queue is empty = " + ArrayQueueAdt.isEmpty(queueAdt));
        System.out.println();

        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(301);
        queue.enqueue(632);
        System.out.println("The first element: " + queue.getFirstElement());
        queue.dequeue();
        System.out.println("Current size: " + queue.size());
        System.out.println("Queue is empty = " + queue.isEmpty());
        queue.clear();
        System.out.println("Queue is empty = " + queue.isEmpty());
    }
}
