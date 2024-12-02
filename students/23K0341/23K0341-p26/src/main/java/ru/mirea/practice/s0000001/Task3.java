package ru.mirea.practice.s0000001;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Напишите реализацию Iterator для вашего собственного List
 */

public abstract class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        for (int i = 0; i < 10; i++) {
            list.addEl(i);
        }

        System.out.println(list);

        for (int el : list) {
            System.out.println(el);
        }
    }

    static class Node<T> {
        Node<T> next;
        T data;

        Node(T data) {
            this(data, null);
        }

        Node(T data, Node<T> next) {
            this.next = next;
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    static class List<T> implements Iterable<T> {
        Node<T> curNode;
        int len;

        List() {
            curNode = null;
        }

        void addEl(T el) {
            len++;
            if (curNode == null) {
                curNode = new Node<T>(el);
                return;
            }

            Node<T> nn = new Node<T>(el);
            Node<T> node = curNode;
            while (node.next != null) {
                node = node.next;
            }
            node.next = nn;
        }

        Node<T> get(int ind) {
            Node<T> node = curNode;
            int c = 0;
            while (c++ < ind) {
                node = node.next;
            }
            return node;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder("List [ ");
            if (curNode != null) {
                Node<T> node = curNode;
                builder.append(node);

                while (node.next != null) {
                    node = node.next;
                    builder.append("; ");
                    builder.append(node);
                }
                builder.append(" ");
            }
            builder.append("]");

            return builder.toString();
        }

        @Override
        public Iterator<T> iterator() {
            return new MyIterator();
        }

        private class MyIterator implements Iterator<T> {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < len;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements present.");
                }
                return get(currentIndex++).data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("NOT SUPPORTED");
            }
        }
    }
}
