package mirea.lab17;


public class List<E> {
    Node<E> node;

    List() {
        node = null;
    }

    public void add(E e) {
        if (node == null) {
            node = new Node<E>(e);
            return;
        }
        Node<E> nNode = node;
        Node<E> newNode = new Node<E>(e);

        while (nNode.next != null) {
            nNode = nNode.next;
        }
        newNode.pr = nNode;
        nNode.next = newNode;
    }

    public void pr() {
        if (node != null) {
            Node<E> dNode = node;

            while (dNode != null) {
                System.out.println(dNode.getData());
                dNode = dNode.next;
            }
        }
    }

    public boolean isEmpty() {
        return node == null;
    }

    public void clr() {
        node = null;
    }

    public void remove() {
        Node<E> dNode = node;
        while (dNode.next != null) {
            dNode = dNode.next;
        }
        dNode.pr.next = null;
    }

    public String current() {
        if (node.cur != null) {
            return node.cur.toString();
        }
        return "";
    }
}
