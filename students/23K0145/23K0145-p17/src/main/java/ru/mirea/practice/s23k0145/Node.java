package ru.mirea.practice.s23k0145;

public class Node {
    String data;
    Node next;
    Node prev;

    public Node(String dataValue) {
        this(dataValue, null, null);
    }

    public Node(String dataValue, Node nextValue, Node prevValue) {
        next = nextValue;
        prev = prevValue;
        data = dataValue;
    }

    public String getData() {
        return data;
    }

    public void setData(String dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prevValue) {
        prev = prevValue;
    }

    @Override
    public String toString() {
        return "Node data=" + data;
    }
}
