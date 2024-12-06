package ru.mirea.practice.s23l0908.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Linkedqueue<T> implements Iterable<T> {
    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

    // helper linked list class
    private class Node {
        private T item;
        private Node next;
    }

    public Linkedqueue() {
        first = null;
        last  = null;
        n = 0;
        assert check();
    }

    public boolean isEmpty() {
        return first == null;
    }

    @SuppressWarnings("unused")
    public int size() {
        return n;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        return first.item;
    }

    public void enqueue(T elem) {
        final Node oldlast = last; // Đánh dấu final
        last = new Node();
        last.item = elem;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        n++;
        assert check();
    }


    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        final T dequeuedItem = first.item;
        first = first.next;
        n--;
        if (isEmpty()) {
            last = null;
        }
        assert check();
        return dequeuedItem;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this) {
            s.append(item + " ");
        }
        return s.toString();
    }

    private boolean check() {
        if (n < 0) {
            return false;
        } else if (n == 0) {
            if (first != null) {
                return false;
            }
            if (last  != null) {
                return false;
            }
        } else if (n == 1) {
            if (first == null || last == null) {
                return false;
            }
            if (first != last)  {
                return false;
            }
            if (first.next != null) {
                return false;
            }
        } else {
            if (first == null || last == null) {
                return false;
            }
            if (first == last)     {
                return false;
            }
            if (first.next == null) {
                return false;
            }
            if (last.next  != null) {
                return false;
            }

            // check internal consistency of instance variable n
            int numberOfNodes = 0;
            for (Node x = first; x != null && numberOfNodes <= n; x = x.next) {
                numberOfNodes++;
            }
            if (numberOfNodes != n) {
                return false;
            }
            Node lastNode = first;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            if (last != lastNode) {
                return false;
            }
        }

        return true;
    }


    public Iterator<T> iterator()  {
        return new LinkedIterator();
    }

    // an iterator, doesn't implement remove() since it's optional
    private class LinkedIterator implements Iterator<T> {
        private Node current = first;

        public boolean hasNext()  {
            return current != null;
        }

        public void remove()  {
            throw new UnsupportedOperationException();
        }

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        Linkedqueue<Integer> queue = new Linkedqueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue: " + queue);
        int removedNumber = queue.dequeue();
        System.out.println("Removed Element: "
            + removedNumber);
        System.out.println("Queue after deletion: "
            + queue);
    }
}
