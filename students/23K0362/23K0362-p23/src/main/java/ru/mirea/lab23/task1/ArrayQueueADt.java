package ru.mirea.lab23.task1;

/*
 Класс ArrayQueueADT должен реализовывать очередь в виде
абстрактного типа данных (с явной передачей ссылки на
экземпляр очереди).
 */

abstract class ArrayQueueADT {
    int size = 10;
    Object[] array = new Object[size];
    int front, rear;

    public ArrayQueueADT() {
        front = -1;
        rear = -1;
    }

    boolean isFull(ArrayQueueADT arrayADT) {
        return (arrayADT.front > 0 && arrayADT.rear == arrayADT.size - 1);
    }

    boolean isEmpty(ArrayQueueADT arrayADT) {
        return (arrayADT.front == -1);
    }

    int getSize(ArrayQueueADT arrayADT) {
        return arrayADT.size;
    }

    void enQueue(ArrayQueueADT arrayADT, Object element) {
        if (isFull(arrayADT)) {
            System.out.println("Queue is full. ");
        } else {
            if (arrayADT.front == -1) {
                arrayADT.front = 0;
            }
            arrayADT.rear++;
            arrayADT.array[rear] = element;
            System.out.println("Insert successful: " + element + ". ");
        }
    }

    Object deQueue(ArrayQueueADT arrayADT) {
        if (isEmpty(arrayADT)) {
            System.out.println("Queue is empty. ");
            return -1;
        } else {
            Object deletedElement = arrayADT.array[arrayADT.front];
            if (arrayADT.front >= arrayADT.rear) {
                arrayADT.front = -1;
                arrayADT.rear = -1;
            } else {
                arrayADT.front++;
            }
            System.out.println("Delete successful: " + deletedElement + ". ");
            return deletedElement;
        }
    }

    void clear(ArrayQueueADT arrayADT) {
        if (!isEmpty(arrayADT)) {
            arrayADT.array = new Object[arrayADT.size];
            arrayADT.front = -1;
            arrayADT.rear = -1;
        }
        System.out.println("Queue is cleared. ");
    }

    void display(ArrayQueueADT arrayADT) {
        if (isEmpty(arrayADT)) {
            System.out.println("Queue is empty. ");
        } else {
            System.out.println("Front index: " + arrayADT.front + ".\n" + "Array elements: ");
            for (int i = arrayADT.front; i < rear + 1; i++) {
                System.out.println(arrayADT.array[i] + " ");
            }
            System.out.println("Rear index: " + arrayADT.rear + ". ");
        }
    }

    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT() {};
        queue.deQueue(queue);
        for (int i = 1; i < 7; i ++) {
            queue.enQueue(queue, i);
        }
        queue.enQueue(queue,6);
        queue.display(queue);
        queue.deQueue(queue);
        queue.deQueue(queue);
        queue.deQueue(queue);
        queue.deQueue(queue);
        queue.display(queue);
        for (int i = 1; i < 7; i ++) {
            queue.enQueue(queue, i);
        }
        queue.clear(queue);
        queue.display(queue);
    }
}
