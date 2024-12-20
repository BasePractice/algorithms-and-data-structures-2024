package ru.mirea.practice.s0000001;

abstract class Main {
    public static void main(String[] args) {
        // ArrayQueueModule
        ArrayQueueModule.enqueue(10);
        ArrayQueueModule.enqueue(20);
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.size());

        // ArrayQueueADT
        ArrayQueueAdt adtQueue = new ArrayQueueAdt();
        ArrayQueueAdt.enqueue(adtQueue, 10);
        ArrayQueueAdt.enqueue(adtQueue, 20);
        System.out.println(ArrayQueueAdt.dequeue(adtQueue));
        System.out.println(ArrayQueueAdt.size(adtQueue));

        // ArrayQueue
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
    }
}
