package ru.mirea.practice.s23k0120.task10;

public class OneLinkedList<E> {
    private Node<E> head = null;
    private int size;

    public int getSize() {
        return size;
    }

    private void add(Node<E> node) throws IllegalArgumentException {
        if (node.hasNext()) {
            throw new IllegalArgumentException("Node is a part of another list");
        }
        if (head == null) {
            head = node;
            size += 1;
            return;
        }
        Node<E> curr = head;
        while (curr.hasNext()) {
            curr = curr.getNext();
        }
        curr.setNext(node);
        size += 1;
    }

    public void add(E e) {
        add(new Node<>(e));
    }

    private void add(Node<E> node, int index) throws IllegalArgumentException {
        if (node.hasNext()) {
            throw new IllegalArgumentException("Node is a part of another list");
        }
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Index " + index + " is out of range for list a of size " + size);
        }
        Node<E> curr = head;
        int i = 0;
        while (i < index) {
            curr = curr.getNext();
            i += 1;
        }
        Node<E> next = curr.getNext();
        curr.setNext(node);
        node.setNext(next);
        size += 1;
    }

    public void add(E e, int index) {
        add(new Node<>(e), index);
    }

    public void addOrdered(E e) {
        Node<E> node = new Node<>(e);
        if (head == null) {
            head = node;
            size += 1;
            return;
        }
        Node<E> curr = head;
        Node<E> prev = null;
        while (curr != null && node.compareTo(curr) > 0) {
            prev = curr;
            curr = curr.getNext();
        }
        if (curr == head) {
            head = node;
            node.setNext(curr);
        } else {
            prev.setNext(node);
            node.setNext(curr);
        }
        size += 1;
    }

    public E remove(int index) throws IllegalArgumentException {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Index " + index + " is out of range for list a of size " + size);
        }
        Node<E> removed;
        if (index == 0) {
            removed = head;
            head = head.getNext();
        } else {
            Node<E> prev = null;
            Node<E> curr = head;
            int i = 0;
            while (i < index) {
                prev = curr;
                curr = curr.getNext();
                i += 1;
            }
            Node<E> next = curr.getNext();
            prev.setNext(next);
            removed = curr;
        }
        size -= 1;
        return removed.getData();
    }

    public E get(int index) throws IllegalArgumentException {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Index " + index + " is out of range for list a of size " + size);
        }
        Node<E> curr = head;
        int i = 0;
        while (i != index) {
            curr = curr.getNext();
            i += 1;
        }
        return curr.getData();
    }

    private Node<E> getNode(int index) throws IllegalArgumentException {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Index " + index + " is out of range for list a of size " + size);
        }
        Node<E> curr = head;
        int i = 0;
        while (i != index) {
            curr = curr.getNext();
            i += 1;
        }
        return curr;
    }

    public int find(E data) {
        Node<E> curr = head;
        int i = 0;
        while (curr.hasNext() && !curr.equals(data)) {
            curr = curr.getNext();
            i += 1;
        }
        if (!curr.equals(data)) {
            i = -1;
        }
        return i;
    }

    public boolean has(E data) {
        int i = find(data);
        return i >= 0 || i <= size;
    }

    public void swap(int indexFirst, int indexSecond) throws IllegalArgumentException {
        Node<E> nodeFirst = getNode(indexFirst);
        E dataFirst = nodeFirst.getData();
        Node<E> nodeSecond = getNode(indexSecond);
        nodeFirst.setData(nodeSecond.getData());
        nodeSecond.setData(dataFirst);
    }

    @Override
    public String toString() {
        Node<E> curr = head;
        if (head == null) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder("{");
        while (curr.hasNext()) {
            stringBuilder.append(curr);
            stringBuilder.append(", ");
            curr = curr.getNext();
        }
        stringBuilder.append(curr);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
