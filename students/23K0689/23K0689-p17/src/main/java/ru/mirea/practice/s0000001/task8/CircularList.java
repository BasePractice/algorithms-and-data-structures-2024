package ru.mirea.practice.s0000001.task8;

class CircularList {
    private Node tail;

    public CircularList() {
        this.tail = null;
    }

    public void addNode(String name, int age) {
        Node newNode = new Node(name, age);
        if (tail == null) {
            tail = newNode;
            tail.setNext(tail);
        } else {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void removeNode(String name) {
        if (tail == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = tail.getNext();
        Node previous = tail;

        do {
            if (current.getName().equals(name)) {
                if (current == tail) {
                    if (tail.getNext() == tail) {
                        tail = null;
                    } else {
                        previous.setNext(current.getNext());
                        tail = previous;
                    }
                } else {
                    previous.setNext(current.getNext());
                }
                System.out.println("Элемент '" + name + "' удален.");
                return;
            }
            previous = current;
            current = current.getNext();
        } while (current != tail.getNext());

        System.out.println("Элемент с именем '" + name + "' не найден.");
    }

    public void displayList() {
        if (tail == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = tail.getNext();
        do {
            current.display();
            current = current.getNext();
        } while (current != tail.getNext());
    }

    public void clear() {
        tail = null;
        System.out.println("Список очищен.");
    }

    public boolean isEmpty() {
        return tail == null;
    }
}

