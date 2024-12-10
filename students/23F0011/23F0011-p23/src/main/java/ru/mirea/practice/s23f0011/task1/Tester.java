package ru.mirea.practice.s23f0011.task1;

public abstract class Tester {
    public static void main(String[] args) {
        // Testing ArrayQueueModule
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println(ArrayQueueModule.element()); // 1
        System.out.println(ArrayQueueModule.dequeue()); // 1
        System.out.println(ArrayQueueModule.size());    // 2
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // true

        // Testing ArrayQueueADT
        ArrayQueueAdt adtQueue = new ArrayQueueAdt();
        ArrayQueueAdt.enqueue(adtQueue, 1);
        ArrayQueueAdt.enqueue(adtQueue, 2);
        ArrayQueueAdt.enqueue(adtQueue, 3);
        System.out.println(ArrayQueueAdt.element(adtQueue)); // 1
        System.out.println(ArrayQueueAdt.dequeue(adtQueue)); // 1
        System.out.println(ArrayQueueAdt.size(adtQueue));    // 2
        ArrayQueueAdt.clear(adtQueue);
        System.out.println(ArrayQueueAdt.isEmpty(adtQueue)); // true

        // Testing ArrayQueue
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.element()); // 1
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.size());    // 2
        queue.clear();
        System.out.println(queue.isEmpty()); // true
    }
}
