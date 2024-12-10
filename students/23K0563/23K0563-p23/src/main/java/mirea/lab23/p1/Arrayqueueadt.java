package mirea.lab23.p1;

public class Arrayqueueadt<T> {
    private T[] q;
    private int front;
    private int back;
    private int am;
    private int size;

    public Arrayqueueadt(int size) {
        front = 0;
        back = 0;
        am = 0;
        this.size = size;
    }

    public void enqueue(T t) {
        if (am < size) {
            q[back] = t;
            am++;
            back = (back + 1) % size;
        }
    }

    public T dequeue() {
        T t = q[front];
        front = (front + 1) % size;
        am--;
        return t;
    }

    public T peek() {
        if (am >= 0) {
            return q[front];
        }
        return null;
    }

    public boolean isFull() {
        return am == size;
    }

    public boolean isEmpty() {
        return am == 0;
    }


}
