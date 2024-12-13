package ru.mirea.lab23.task2;

public abstract class AbstractQueue {
    protected int size;
    protected int maxSize;

    public abstract void enQueueFunc(Object item);

    public abstract Object getFirstFunc();

    public abstract Object deQueueFunc();

    public abstract Object getElementFunc(int count);

    public abstract void displayFunc();

    public boolean isEmpty() { // Проверка пустоты очереди
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    void enQueue(Object element) {
        if (isFull()) {
            System.out.println("Queue is full. ");
        } else {
            enQueueFunc(element);
            size++;
            }
    }

    Object deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
            return -1;
        } else {
            Object result = getFirstFunc();
            deQueueFunc();
            size--;
            return result;
        }
    }

    void clear() {
        while (!isEmpty()) {
            deQueueFunc();
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
        } else {
            for (int i = size; i <= maxSize; i++) {
                System.out.println(getElementFunc(i) + " ");
            }
        }
    }
}
