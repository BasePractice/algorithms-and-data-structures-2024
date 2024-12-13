package ru.mirea.practice.s23k0368.prog2;


public abstract class Test {
    public static void main(String[] args) {
        arrayQueueTest();
    }

    static void arrayQueueTest() {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.size());    // 1
        System.out.println(queue.isEmpty()); // false
        queue.clear();
        System.out.println(queue.isEmpty()); // true
    }

    static  void testLinkesQueue() {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.size());    // 1
    }
}
