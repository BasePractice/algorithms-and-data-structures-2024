package ru.mirea.practice.s23k0690;


public final class Task2 {

    private Task2() {}

    public static void main(String[] args) {

        LinkedQueue<Integer> queue = new LinkedQueue<>();

        System.out.println("Тест 1: Очередь пуста? " + (queue.isEmpty() ? "Да" : "Нет"));

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Тест 2: Добавлено 3 элемента. Текущий размер очереди: " + queue.size());

        System.out.println("Тест 3: Первый элемент очереди: " + queue.element());

        System.out.println("Тест 4: Удаленный элемент: " + queue.dequeue());
        System.out.println("Текущий размер очереди после удаления: " + queue.size());

        System.out.println("Тест 5: Очередь пуста? " + (queue.isEmpty() ? "Да" : "Нет"));

        queue.clear();
        System.out.println("Тест 6: Очередь очищена. Текущий размер очереди: " + queue.size());
        System.out.println("Тест 7: Очередь пуста? " + (queue.isEmpty() ? "Да" : "Нет"));
    }
}
