package ru.mirea.practice.s23k0823.task1.task1.task1;

public abstract class Main {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueAdt();
        testArrayQueue();
    }

    private static void testArrayQueueModule() {
        System.out.println("Тестирование ArrayQueueModule");
        ArrayQueueModule queue = new ArrayQueueModule();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Размер: " + queue.size());
        System.out.println("Удаление: " + queue.dequeue());
        System.out.println("Размер после удаления: " + queue.size());
        queue.clear();
        System.out.println("Размер после очистки: " + queue.size());
    }

    private static void testArrayQueueAdt() {
        System.out.println("Тестирование ArrayQueueADT");
        ArrayQueueAdt queue = ArrayQueueAdt.create();
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Размер: " + queue.size());
        System.out.println("Удаление: " + queue.dequeue());
        System.out.println("Размер после удаления: " + queue.size());
        queue.clear();
        System.out.println("Размер после очистки: " + queue.size());
    }

    private static void testArrayQueue() {
        System.out.println("Тестирование ArrayQueue");
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Размер: " + queue.size());
        System.out.println("Удаление: " + queue.dequeue());
        System.out.println("Размер после удаления: " + queue.size());
        queue.clear();
        System.out.println("Размер после очистки: " + queue.size());
    }
}

