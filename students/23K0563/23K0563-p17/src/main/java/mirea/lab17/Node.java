package mirea.lab17;

public class Node<E> {
    Node<E> pr;
    E cur;
    Node<E> next;

    Node(E cur, Node<E> next, Node<E> pr) {
        this.pr = pr;
        this.cur = cur;
        this.next = next;
    }

    Node(E e) {
        cur = e;
        next = null;
        pr = null;
    }

    public String getData() {
        return cur.toString();
    }

}
