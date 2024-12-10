package ru.mirea.practice.s23k0120.task10;

import java.util.Objects;

public class Node<E> implements Comparable<E> {
    private E data;
    private Node<E> next = null;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return getNext() != null;
    }

    @Override
    public int compareTo(Object o) {
        Node nodeComp = (Node) o;
        Comparable<Object> data = (Comparable<Object>) getData();
        return data.compareTo(nodeComp.getData());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
