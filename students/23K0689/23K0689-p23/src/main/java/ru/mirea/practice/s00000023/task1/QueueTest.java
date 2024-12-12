package ru.mirea.practice.s00000023.task1;

public final class QueueTest {

    private QueueTest() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println(ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.element());
        System.out.println(ArrayQueueModule.size());
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());

        ArrayQueueAdt queueAdt = new ArrayQueueAdt();
        queueAdt.enqueue(3);
        queueAdt.enqueue(4);
        System.out.println(queueAdt.dequeue());
        System.out.println(queueAdt.element());
        queueAdt.clear();
        System.out.println(queueAdt.isEmpty());

        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
