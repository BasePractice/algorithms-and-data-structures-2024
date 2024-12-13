package ru.mirea.lab23.task2;

/*
4 Определите интерфейс очереди Queue и опишите его контракт.
 */

public interface Queue {
    //Предусловие: нет
    //Постусловие: front > 0 && rear == size - 1 (true если истинно, false если ложно)
    boolean isFull();

    //Предусловие: нет
    //Постусловие: front == -1 (true если истинно, false если ложно)
    boolean isEmpty();

    //Предусловие: нет
    //Постусловие: возвращение размера массива (size)
    int getSize();

    //Предусловие: isFull() - проверяет заполнен ли массив
    //Постусловие: если список не заполнен, добавляет элемент и выводит его в консоль,
    // иначе пишет список заполен
    void enQueue(Object element);

    //Предусловие: isEmpty() - проверяет пуст ли массив
    //Постусловие: front >= rear -> front = rear = -1
    //Постусловие: front < rear -> front++
    //Постусловие: return deleted element
    Object deQueue();

    //Предусловие: !isEmpty() -> array = new Object[size], front = rear = -1;
    //Постусловие: выводит список очищен в консоль
    void clear();

    //Предусловие: isEmpty() -> выводит список пуст в консоль;
    //Постусловие: выводит front, все элементы очереди и rear
    void display();
}
