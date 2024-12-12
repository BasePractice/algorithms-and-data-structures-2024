package ru.mirea.practice.s00000023.task2;

public final class QueueTest {

    private QueueTest() {
    }

    public static void main(String[] args) {
        Queue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.element());
        System.out.println(linkedQueue.size());
        linkedQueue.clear();
        System.out.println(linkedQueue.isEmpty());

        Queue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.element());
        arrayQueue.clear();
        System.out.println(arrayQueue.isEmpty());
    }
}
