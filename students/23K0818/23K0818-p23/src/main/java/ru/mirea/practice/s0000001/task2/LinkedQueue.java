package ru.mirea.practice.s0000001.task2;

public class LinkedQueue implements Queue {
    private Nodes head;
    private Nodes tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        int count = 0;
        Nodes current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public void clear() {
        head = tail = null;
    }

    @Override
    public void enqueue(Object a) {
        Nodes newNode = new Nodes(a);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object data = head.cons;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return head.cons;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
        queue.enqueue("a");
        queue.enqueue(1);
        queue.enqueue(true);
        System.out.println(queue.dequeue());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        queue.enqueue("a");
        queue.enqueue(1);
        queue.enqueue(true);
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
