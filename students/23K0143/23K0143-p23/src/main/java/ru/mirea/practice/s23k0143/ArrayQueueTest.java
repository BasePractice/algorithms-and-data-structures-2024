package ru.mirea.practice.s23k0143;

public abstract class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        System.out.println("Очередь пустая: " + queue.isEmpty());

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Удален элемент: " + queue.dequeue());
        System.out.println("Пользователь после удаления: " + queue.element());

        queue.clear();
        System.out.println("Очередь пустая после очистки: " + queue.isEmpty());

        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
