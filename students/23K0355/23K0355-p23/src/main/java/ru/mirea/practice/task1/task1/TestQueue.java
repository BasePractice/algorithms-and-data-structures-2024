package ru.mirea.practice.task1.task1;

public final class TestQueue {

    private TestQueue() {
        throw new UnsupportedOperationException("Утилитный класс не должен быть создан");
    }

    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println("Первый элемент (ArrayQueueModule): " + ArrayQueueModule.element());
        System.out.println("Удалённый элемент (ArrayQueueModule): " + ArrayQueueModule.dequeue());
        System.out.println("Размер (ArrayQueueModule): " + ArrayQueueModule.size());
        ArrayQueueModule.clear();
        System.out.println("Пусто (ArrayQueueModule): " + ArrayQueueModule.isEmpty());

        ArrayQueueAdt q = new ArrayQueueAdt();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Первый элемент (ArrayQueueADT): " + q.element());
        System.out.println("Удалённый элемент (ArrayQueueADT): " + q.dequeue());
        System.out.println("Размер (ArrayQueueADT): " + q.size());
        q.clear();
        System.out.println("Пусто (ArrayQueueADT): " + q.isEmpty());

        ArrayQueue a = new ArrayQueue();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        System.out.println("Первый элемент (ArrayQueue): " + a.element());
        System.out.println("Удалённый элемент (ArrayQueue): " + a.dequeue());
        System.out.println("Размер (ArrayQueue): " + a.size());
        a.clear();
        System.out.println("Пусто (ArrayQueue): " + a.isEmpty());
    }
}
