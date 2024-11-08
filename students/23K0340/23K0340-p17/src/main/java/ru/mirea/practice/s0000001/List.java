package ru.mirea.practice.s0000001;

public class List {
    private Student head;
    private Student tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    public void addFont() {
        Student a = new Student();
        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }

    public void delEl(int id) {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.getId() == id) {
            head = head.next;
            return;
        }
        Student f = head;
        while (f.next != null) {
            if (f.next.getId() == id) {
                if (tail == f.next) {
                    tail = f;
                }
                f.next = f.next.next;
                return;
            }
            f = f.next;
        }
    }

    public void printInfo(int id) {
        if (head == null) {
            return;
        }
        if (head.getId() == id) {
            head.print();
            return;
        }
        Student f = head;
        while (f.next != null) {
            if (f.next.getId() == id) {
                f.next.print();
                return;
            }
            f = f.next;
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
