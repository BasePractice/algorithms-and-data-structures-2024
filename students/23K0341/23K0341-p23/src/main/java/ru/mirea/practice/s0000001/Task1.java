package ru.mirea.practice.s0000001;

import java.util.NoSuchElementException;

public abstract class Task1 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();
        if (queue.isEmpty()) {
            System.out.println("Empty.");
        }
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(8);

        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue);

        queue.clear();

        System.out.println(queue);
    }

    static class ArrayQueue {
        private Object[] queue;
        private Object element;
        int size;

        boolean isEmpty() {
            return size == 0;
        }

        public ArrayQueue() {
            this(null);
        }

        public ArrayQueue(Object el) {
            element = el;
            if (el != null) {
                size = 1;
            } else {
                size = 0;
            }
            queue = new Object[8];
        }

        public void enqueue(Object el) {
            if (size == 0) {
                element = el;
                size++;
            } else {
                if (queue.length == size) {
                    System.out.println("FULl");
                    Object[] old = queue;
                    queue = new Object[old.length * 2];
                    System.arraycopy(old, 0, queue, 0, old.length);
                } else {
                    queue[size++ - 1] = el;
                }
            }
        }

        public Object dequeue() {
            if (size == 0) {
                throw new NoSuchElementException("Queue is empty.");
            }

            Object el = element;
            if (size > 1) {
                element = queue[0];
                for (int i = 1; i < size; i++) {
                    queue[i - 1] = queue[i];
                }
            }
            size--;

            return el;
        }

        public void clear() {
            element = null;
            queue = new Object[8];
            size = 0;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("ArrayQueue {\n");

            for (int i = 0; i < size; i++) {
                builder.append("    ").append(i).append(". ");
                if (i == 0) {
                    builder.append(element);
                } else {
                    builder.append(queue[i - 1]);
                }
                builder.append("\n");
            }
            builder.append("}\n");

            return builder.toString();
        }
    }
}
