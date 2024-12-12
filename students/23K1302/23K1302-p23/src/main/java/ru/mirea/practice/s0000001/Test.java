package ru.mirea.practice.s0000001;

public final class Test {

    private Test() {
        // jf;nvs;jfnv;
    }

    public static void main(String[] args) {
        System.out.println("Тестирование ArrayQueueModule:");
        testarrayqueuemodule();

        System.out.println("\nТестирование ArrayQueueADT:");
        testarrayaueueadt();

        System.out.println("\nТестирование ArrayQueue:");
        testarrayqueue();
    }

    private static void testarrayqueuemodule() {
        Arrayqueuemodule.enqueue(1);
        Arrayqueuemodule.enqueue(2);
        System.out.println("Элементы добавлены: 1, 2");
        System.out.println("Первый элемент: " + Arrayqueuemodule.element());
        System.out.println("Удалён первый элемент: " + Arrayqueuemodule.dequeue());
        System.out.println("Текущий размер: " + Arrayqueuemodule.size());
        System.out.println("Очередь пуста? " + Arrayqueuemodule.isEmpty());
        Arrayqueuemodule.clear();
        System.out.println("Очередь очищена.");
        System.out.println("Очередь пуста? " + Arrayqueuemodule.isEmpty());
    }

    private static void testarrayaueueadt() {
        Arrayqueueadt queueadt = new Arrayqueueadt();
        Arrayqueueadt.enqueue(queueadt, 1);
        Arrayqueueadt.enqueue(queueadt, 2);
        System.out.println("Элементы добавлены: 1, 2");
        System.out.println("Первый элемент: " + Arrayqueueadt.element(queueadt));
        System.out.println("Удалён первый элемент: " + Arrayqueueadt.dequeue(queueadt));
        System.out.println("Текущий размер: " + Arrayqueueadt.size(queueadt));
        System.out.println("Очередь пуста? " + Arrayqueueadt.isEmpty(queueadt));
        Arrayqueueadt.clear(queueadt);
        System.out.println("Очередь очищена.");
        System.out.println("Очередь пуста? " + Arrayqueueadt.isEmpty(queueadt));
    }

    private static void testarrayqueue() {
        Arrayqueue queue = new Arrayqueue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Элементы добавлены: 1, 2");
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удалён первый элемент: " + queue.dequeue());
        System.out.println("Текущий размер: " + queue.size());
        System.out.println("Очередь пуста? " + queue.isEmpty());
        queue.clear();
        System.out.println("Очередь очищена.");
        System.out.println("Очередь пуста? " + queue.isEmpty());
    }
}
