package ru.mirea.lab23.task2;

/*
5 Реализуйте класс LinkedQueue — очередь на связном списке.
 */

public class LinkedQueue {
    private Node head;
    private Node tail;
    private final int maxSize;
    private int size;

    public LinkedQueue(int maxSize) {
        this.head = new Node(null, null, null);
        this.tail = head;
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return (size == maxSize);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getSize() {
        return size;
    }

    public Object getFirst() {
        return head.value;
    }

    public void enQueue(Object element) {
        if (isFull()) {
            System.out.println("Queue is full. ");
        } else {
            if (size == 0) {
                head.value = element;
            } else {
                tail.next = new Node(element, tail, null);
                tail = tail.next;
            }
            size++;
            System.out.println("Insert successful: " + element + ". ");
        }
    }

    public Object deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
            return -1;
        } else {
            Object deletedElement = head.value;
            if (size == 1) {
                head.value = null;
                tail = head;
            } else {
                head.next.prev = null;
                head = head.next;
            }
            size--;
            System.out.println("Delete successful: " + deletedElement + ". ");
            return deletedElement;
        }
    }

    //Предусловие: !isEmpty() -> array = new Object[size], front = rear = -1;
    //Постусловие: выводит список очищен в консоль
    public void clear() {
        if (!isEmpty()) {
            head = new Node(null, null, null);
            tail = head;
        }
        System.out.println("Queue is cleared. ");
    }

    //Предусловие: isEmpty() -> выводит список пуст в консоль;
    //Постусловие: выводит front, все элементы очереди и rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty. ");
        } else {
            getElements(head);
        }
    }

    private void getElements(Node value) {
        System.out.println(value.value);
        if (value.next != null) {
            getElements(value.next);
        }
    }
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue(10);
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
