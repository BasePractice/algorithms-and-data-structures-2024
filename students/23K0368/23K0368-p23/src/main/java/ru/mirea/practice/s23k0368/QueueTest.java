package ru.mirea.practice.s23k0368;

public abstract class QueueTest {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueadt();
        testArrayQueue();
    }

    private static void testArrayQueueModule() {
        ArrayQueuemodule.enqueue(1);
        ArrayQueuemodule.enqueue(2);
        System.out.println(ArrayQueuemodule.dequeue()); // 1
        System.out.println(ArrayQueuemodule.size());    // 1
        System.out.println(ArrayQueuemodule.isEmpty()); // false
        ArrayQueuemodule.clear();
        System.out.println(ArrayQueuemodule.isEmpty()); // true
    }

    private static void testArrayQueueadt() {
        ArrayQueueadt queueAdt = new ArrayQueueadt();
        ArrayQueueadt.enqueue(queueAdt, 1);
        ArrayQueueadt.enqueue(queueAdt, 2);
        System.out.println(ArrayQueueadt.dequeue(queueAdt)); // 1
        System.out.println(ArrayQueueadt.size(queueAdt));    // 1
        System.out.println(ArrayQueueadt.isEmpty(queueAdt)); // false
        ArrayQueueadt.clear(queueAdt);
        System.out.println(ArrayQueueadt.isEmpty(queueAdt)); // true
    }

    private static void testArrayQueue() {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.size());    // 1
        System.out.println(queue.isEmpty()); // false
        queue.clear();
        System.out.println(queue.isEmpty()); // true
    }
}
