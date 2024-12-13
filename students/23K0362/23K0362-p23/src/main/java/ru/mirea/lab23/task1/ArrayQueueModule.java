package ru.mirea.lab23.task1;

/*
 Класс ArrayQueueModule должен реализовывать один
экземпляр очереди с использованием переменных класса.
 */

/*
Инвариант очереди - FIFO (first in first out). Т.е удаляется первый вошедший элемент в список.
Необходимые функции и их пред- и постусловия:
enqueue - добавить элемент (предусловие: если очередь с ограничением на размер - проверить на заполненность;
                            постусловие: добавление элемента в очередь)
dequeue - удалить элемент (предусловие: проверить на пустоту очередь;
                            постусловие: удаление первого элемента и возвращение его)
isEmpty - проверка списка на пустоту (предусловие: ничего;
                            постусловие: возвращение 1 если список пустой, иначе 0)
getFirst - посмотреть на первый элемент (предусловие: проверка на пустоту очереди;
                            постусловие: возвращение первого элемента)
 */

public class ArrayQueueModule {
    private int size = 10;
    private Object[] array = new Object[size];
    private int front, rear;

    ArrayQueueModule() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return (front > 0 && rear == size - 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    int getSize() {
        return size;
    }

    void enQueue(Object element) {
        if (isFull()) {
            System.out.println("Queue is full. ");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            array[rear] = element;
            System.out.println("Insert successful: " + element + ". ");
        }
    }

    Object deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
            return -1;
        } else {
            Object deletedElement = array[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Delete successful: " + deletedElement + ". ");
            return deletedElement;
        }
    }

    void clear() {
        if (!isEmpty()) {
            array = new Object[size];
            front = -1;
            rear = -1;
        }
        System.out.println("Queue is cleared. ");
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
        } else {
            System.out.println("Front index: " + front + ".\n" + "Array elements: ");
            for (int i = front; i < rear + 1; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println("Rear index: " + rear + ". ");
        }
    }

    public static void main(String[] args) {
        ArrayQueueModule queue = new ArrayQueueModule();
        queue.deQueue();
        for (int i = 1; i < 7; i ++) {
            queue.enQueue(i);
        }
        queue.enQueue(6);
        queue.display();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.display();
        for (int i = 1; i < 7; i ++) {
            queue.enQueue(i);
        }
        queue.clear();
        queue.display();
    }
}