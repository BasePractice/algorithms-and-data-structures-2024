package ru.mirea.practice.s23k0690;

public final class Task1 {

    private Task1() {}

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);

        if (queue.isEmpty()) {
            System.out.println("Тест 1 пройден: Очередь пуста.");
        } else {
            System.out.println("Тест 1 не пройден: Очередь не пуста.");
        }

        queue.enqueue(1);
        queue.enqueue(2);

        if (queue.size() == 2) {
            System.out.println("Тест 2 пройден: Размер очереди равен 2.");
        } else {
            System.out.println("Тест 2 не пройден: Размер очереди не равен 2.");
        }

        if (queue.element().equals(1)) {
            System.out.println("Тест 3 пройден: Первый элемент равен 1.");
        } else {
            System.out.println("Тест 3 не пройден: Первый элемент не равен 1.");
        }

        if (queue.dequeue().equals(1)) {
            System.out.println("Тест 4 пройден: Удаленный элемент равен 1.");
        } else {
            System.out.println("Тест 4 не пройден: Удаленный элемент не равен 1.");
        }

        if (queue.size() == 1) {
            System.out.println("Тест 5 пройден: Размер очереди равен 1 после удаления.");
        } else {
            System.out.println("Тест 5 не пройден: Размер очереди не равен 1 после удаления.");
        }

        queue.clear();

        if (queue.isEmpty()) {
            System.out.println("Тест 6 пройден: Очередь пуста после очистки.");
        } else {
            System.out.println("Тест 6 не пройден: Очередь не пуста после очистки.");
        }
    }
}









