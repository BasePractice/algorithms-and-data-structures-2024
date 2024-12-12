package ru.mirea.lab23.task1;

/*
 Класс ArrayQueue должен реализовывать очередь в виде класса
(с неявной передачей ссылки на экземпляр очереди).
 */

public class ArrayQueue {
    private int size = 10;
    private Object[] array = new Object[size];
    private int front, rear;

    ArrayQueue() {
        front = -1;
        rear = -1;
    }

    //Предусловие: нет
    //Постусловие: front > 0 && rear == size - 1 (true если истинно, false если ложно)
    boolean isFull() {
        return (front > 0 && rear == size - 1);
    }

    //Предусловие: нет
    //Постусловие: front == -1 (true если истинно, false если ложно)
    boolean isEmpty() {
        return (front == -1);
    }

    //Предусловие: нет
    //Постусловие: возвращение размера массива (size)
    int getSize() {
        return size;
    }

    //Предусловие: isFull() - проверяет заполнен ли массив
    //Постусловие: если список не заполнен, добавляет элемент и выводит его в консоль,
    // иначе пишет список заполен
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

    //Предусловие: isEmpty() - проверяет пуст ли массив
    //Постусловие: front >= rear -> front = rear = -1
    //Постусловие: front < rear -> front++
    //Постусловие: return deleted element
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

    //Предусловие: !isEmpty() -> array = new Object[size], front = rear = -1;
    //Постусловие: выводит список очищен в консоль
    void clear() {
        if (!isEmpty()) {
            array = new Object[size];
            front = -1;
            rear = -1;
        }
        System.out.println("Queue is cleared. ");
    }

    //Предусловие: isEmpty() -> выводит список пуст в консоль;
    //Постусловие: выводит front, все элементы очереди и rear
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
        ArrayQueue queue = new ArrayQueue();
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