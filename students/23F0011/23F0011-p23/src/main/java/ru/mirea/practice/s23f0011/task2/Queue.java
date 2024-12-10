package ru.mirea.practice.s23f0011.task2;

public interface Queue {
    // Добавляет элемент в конец очереди
    void enqueue(Object element);

    // Возвращает первый элемент очереди без удаления
    Object element();

    // Удаляет и возвращает первый элемент очереди
    Object dequeue();

    // Возвращает текущий размер очереди
    int size();

    // Проверяет, является ли очередь пустой
    boolean isEmpty();

    // Очищает очередь
    void clear();
}

