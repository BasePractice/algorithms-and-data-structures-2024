package mirea.lab23.p2;

public class Node<E> {
    E cur;
    Node<E> next;

    Node(E e) {
        cur = e;
        next = null;

    }

    public String getData() {
        return cur.toString();
    }

}
