package ru.mirea.practice.s0000001.num2;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Queue queue = new LinkedQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Элемент в очереди: " + queue.element());
        System.out.println("Удалён элемент: " + queue.dequeue());
        System.out.println("Размер очереди: " + queue.size());
        queue.clear();
        System.out.println("Очередь очищена. Пустая? " + queue.isEmpty());
    }
}
