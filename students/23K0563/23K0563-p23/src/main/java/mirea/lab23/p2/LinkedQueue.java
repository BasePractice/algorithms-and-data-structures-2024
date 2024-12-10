package mirea.lab23.p2;

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> front;
    private Node<T> back;
    private int size;

    public LinkedQueue() {
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void enqueue(T t) {
        Node<T> node = new Node<T>(t);
        if (isEmpty()) {
            front = node;
        } else {
            back.next = node;
        }
        size++;
        back = node;
    }

    @Override
    public T dequeue() {
        final T t = front.cur;
        front = front.next;
        size--;
        if (isEmpty()) {
            back = null;
        }
        return t;
    }

    @Override
    public T peek() {
        if (!isEmpty()) {
            return front.cur;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
