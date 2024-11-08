package ru.mirea.practice.s0000001.task2;

class Nodes {
    Shape shape;
    Nodes next;
    Nodes prev; // Ссылка на предыдущий узел

    public Nodes(Shape shape) {
        this.shape = shape;
        this.next = null;
        this.prev = null; // Изначально предшествующий узел null
    }

}
