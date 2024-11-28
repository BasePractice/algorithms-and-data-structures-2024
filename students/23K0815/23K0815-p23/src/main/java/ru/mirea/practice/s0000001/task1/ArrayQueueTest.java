package ru.mirea.practice.s0000001.task1;

public abstract class ArrayQueueTest {
    public static void main(String[] args) {
        // Тест для ArrayQueueModule
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println(ArrayQueueModule.element()); // Вывод: 1
        System.out.println(ArrayQueueModule.dequeue()); // Вывод: 1
        System.out.println(ArrayQueueModule.size());    // Вывод: 1
        System.out.println(ArrayQueueModule.isEmpty()); // Вывод: false
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // Вывод: true

        // Тест для ArrayQueueAdt
        ArrayQueueAdt queueAdt = new ArrayQueueAdt(5);
        queueAdt.enqueue(3);
        queueAdt.enqueue(4);
        System.out.println(queueAdt.element()); // Вывод: 3
        System.out.println(queueAdt.dequeue()); // Вывод: 3
        System.out.println(queueAdt.size());    // Вывод: 1
        System.out.println(queueAdt.isEmpty()); // Вывод: false
        queueAdt.clear();
        System.out.println(queueAdt.isEmpty()); // Вывод: true

        // Тест для ArrayQueue
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.element()); // Вывод: 5
        System.out.println(queue.dequeue()); // Вывод: 5
        System.out.println(queue.size());    // Вывод: 1
        System.out.println(queue.isEmpty()); // Вывод: false
        queue.clear();
        System.out.println(queue.isEmpty()); // Вывод: true
    }
}