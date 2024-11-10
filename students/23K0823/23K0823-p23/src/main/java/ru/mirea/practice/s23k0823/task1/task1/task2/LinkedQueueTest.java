package ru.mirea.practice.s23k0823.task1.task1.task2;

public abstract class LinkedQueueTest {
    public static void main(String[] args) {
        testQueue(new LinkedQueue<>(), "LinkedQueue");
        testQueue(new LinkedQueue2<>(), "LinkedQueue2");
    }

    @SuppressWarnings("PMD.UnusedPrivateMethod")
    private static void testQueue(Queue<Integer> queue, String queueName) {
        System.out.println("Тестирование очереди: " + queueName);

        System.out.println("Очередь пуста: " + queue.isEmpty());
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Добавляем 1 в очередь");
        queue.enqueue(1);
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Добавляем 2 в очередь");
        queue.enqueue(2);
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Добавляем 3 в очередь");
        queue.enqueue(3);
        System.out.println("Размер очереди: " + queue.size());

        System.out.println("Первый элемент в очереди: " + queue.element());

        System.out.println("Удаляем элемент: " + queue.dequeue());
        System.out.println("Размер очереди после удаления: " + queue.size());

        System.out.println("Удаляем элемент: " + queue.dequeue());
        System.out.println("Размер очереди после удаления: " + queue.size());

        System.out.println("Первый элемент в очереди: " + queue.element());

        System.out.println("Удаляем элемент: " + queue.dequeue());
        System.out.println("Очередь пуста: " + queue.isEmpty());
        System.out.println("Размер очереди: " + queue.size());

        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println();
    }
}