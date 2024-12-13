package ru.mirea.practice.s0000001;

abstract class Main {
    public static void main(String[] args) {
        Queue arrayQueue = new ArrayQueue();
        Queue linkedQueue = new LinkedQueue();

        testQueue(arrayQueue);
        testQueue(linkedQueue);
    }

    private static void testQueue(Queue queue) {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("First element: " + queue.element());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Size: " + queue.size());
        System.out.println("Is empty: " + queue.isEmpty());

        queue.clear();
        System.out.println("Cleared. Is empty: " + queue.isEmpty());
    }
}
