package ru.mirea.practice.s29k0112;

public final class TestQueue {
    private TestQueue() {

    }

    public static void main(String[] args) {
        // ArrayQueue
        System.out.println("Test ArrayQueue:");
        ArrayQueue arrayQueue = new ArrayQueue(5);
        for (int i = 1; i <= 3; i++) {
            arrayQueue.enqueue(i);
            System.out.println("Поставленн в очередь: " + i);
        }
        System.out.println("Первый элемент: " + arrayQueue.element());
        while (!arrayQueue.isEmpty()) {
            System.out.println("Убран из очереди: " + arrayQueue.dequeue());
        }
        System.out.println("Очередь пустая: " + arrayQueue.isEmpty());

        // ArrayADT
        System.out.println("\nTest ArrayQueueADT:");
        ArrayQueueAdt queueAdt = new ArrayQueueAdt(5);
        for (int i = 1; i <= 3; i++) {
            queueAdt.enqueue(i);
            System.out.println("Поставленн в очередь: " + i);
        }
        System.out.println("Первый элемент: " + queueAdt.element());
        while (!queueAdt.isEmpty()) {
            System.out.println("Убран из очереди: " + queueAdt.dequeue());
        }
        System.out.println("Очередь пустая: " + queueAdt.isEmpty());

        // ArrayModule
        System.out.println("\nTest ArrayQueueModule:");
        ArrayQueueModule queueModule = new ArrayQueueModule();
        for (int i = 1; i <= 3; i++) {
            queueModule.enqueue(i);
            System.out.println("Поставленн в очередь: " + i);
        }
        System.out.println("Первый элемент: " + queueModule.element());
        while (!queueModule.isEmpty()) {
            System.out.println("Убран из очереди: " + queueModule.dequeue());
        }
        System.out.println("Очередь пустая: " + queueModule.isEmpty());

        // LinkedQueue
        System.out.println("\nTest LinkedQueue:");
        LinkedQueue<Integer> queueLinked = new LinkedQueue<>();
        for (int i = 1; i <= 3; i++) {
            queueLinked.enqueue(i);
            System.out.println("Поставленн в очередь: " + i);
        }
        System.out.println("Первый элемент: " + queueLinked.element());
        while (!queueLinked.isEmpty()) {
            System.out.println("Убран из очереди: " + queueLinked.dequeue());
        }
        System.out.println("Очередь пустая: " + queueLinked.isEmpty());
    }
}

