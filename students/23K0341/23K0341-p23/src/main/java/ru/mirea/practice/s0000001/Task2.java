package ru.mirea.practice.s0000001;

public abstract class Task2 {
    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
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

    static class LinkedQueue<T> {
        Node<T> curNode;

        LinkedQueue() {
            curNode = null;
        }

        void enqueue(T data) {
            if (curNode == null) {
                curNode = new Node<T>(data);
                return;
            }

            Node<T> nn = new Node<T>(data);
            Node<T> node = curNode;
            while (node.next != null) {
                node = node.next;
            }
            node.next = nn;
        }

        void clear() {
            curNode = null;
        }

        boolean isEmpty() {
            return curNode == null;
        }

        Node<T> dequeue() {
            Node<T> node = curNode;
            if (node.next == null) {
                curNode = null;
            } else {
                curNode = node.next;
                node.next = null;
            }
            return node;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("LinkedQueue {\n");

            if (curNode != null) {
                Node<T> node = curNode;
                int i = 0;
                builder.append("    ").append(i++).append(". ");
                builder.append(node).append("\n");

                while (node.next != null) {
                    node = node.next;
                    builder.append("    ").append(i++).append(". ");
                    builder.append(node).append("\n");
                }
            }

            builder.append("}\n");

            return builder.toString();
        }
    }

    static class Node<T> {
        Node<T> next;
        T data;

        Node(T data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
}
