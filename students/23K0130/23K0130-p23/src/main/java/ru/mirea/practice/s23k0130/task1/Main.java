package ru.mirea.practice.s23k0130.task1;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        System.out.println("Тестирование ArrayQueueModule:");
        testarrayqueuemodule();

        System.out.println("\nТестирование ArrayQueueADt:");
        testarrayaueueadt();

        System.out.println("\nТестирование ArrayQueue:");
        testarrayqueue();
    }

    private static void testarrayqueuemodule() {
        ArrayQueueModule.enqueue(0);
        ArrayQueueModule.enqueue(1);
        System.out.println("Элементы добавлены: 0, 1");
        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Удалён первый элемент: " + ArrayQueueModule.dequeue());
        System.out.println("Текущий размер: " + ArrayQueueModule.size());
        System.out.println("Очередь пуста? " + ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println("Очередь очищена.");
        System.out.println("Очередь пуста? " + ArrayQueueModule.isEmpty());
    }

    private static void testarrayaueueadt() {
        ArrayQueueADt queueadt = new ArrayQueueADt();
        ArrayQueueADt.enqueue(queueadt, 0);
        ArrayQueueADt.enqueue(queueadt, 2);
        System.out.println("Элементы добавлены: 0, 2");
        System.out.println("Первый элемент: " + ArrayQueueADt.element(queueadt));
        System.out.println("Удалён первый элемент: " + ArrayQueueADt.dequeue(queueadt));
        System.out.println("Текущий размер: " + ArrayQueueADt.size(queueadt));
        System.out.println("Очередь пуста? " + ArrayQueueADt.isEmpty(queueadt));
        ArrayQueueADt.clear(queueadt);
        System.out.println("Очередь очищена.");
        System.out.println("Очередь пуста? " + ArrayQueueADt.isEmpty(queueadt));
    }

    private static void testarrayqueue() {
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(0);
        queue.enqueue(6);
        System.out.println("Элементы добавлены: 0, 6");
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удалён первый элемент: " + queue.dequeue());
        System.out.println("Текущий размер: " + queue.size());
        System.out.println("Очередь пуста? " + queue.isEmpty());
        queue.clear();
        System.out.println("Очередь очищена.");
        System.out.println("Очередь пуста? " + queue.isEmpty());
    }
}
