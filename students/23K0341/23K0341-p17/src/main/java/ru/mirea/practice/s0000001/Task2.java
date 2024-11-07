package ru.mirea.practice.s0000001;

/**
 * 2. Контейнерный класс  Список (группа, компания, склад и т.п.), содержащий:
 * контейнер (список) ссылок на класс-элемент;
 * a. Функцию создания пустого списка +
 * b. функцию добавления элемента (узла)  списка; +
 * c. Функцию удаления элемента из списка +
 * d. функцию вывода элемента (узла) списка на экран;
 * e. функцию очистки списка. +
 * f. Функцию проверки списка на пустоту (isEmpty) +
 * g. Функцию записи списка в файл (не обязательно)
 * h. Функцию чтения списка из файла (не обязательно)
 * Note: Выполнена обязательная часть, без примеров.
 */

public abstract class Task2 {
    public static void main(String[] args) {
        System.out.println("Hello there.");
    }

    static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T data;

        Node(T data) {
            this.data = data;
            next = null;
            prev = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    static class List<T> {
        Node<T> curNode;

        List() {
            curNode = null;
        }

        void addEl(T data) {
            if (curNode == null) {
                curNode = new Node<T>(data);
                return;
            }

            Node<T> nn = new Node<T>(data);
            Node<T> node = curNode;
            while (node.next != null) {
                node = node.next;
            }
            nn.prev = node;
            node.next = nn;
        }

        void clear() {
            curNode = null;
        }

        boolean isEmpty() {
            return curNode == null;
        }

        void delLast() {
            Node<T> node = curNode;
            while (node.next != null) {
                node = node.next;
            }

            if (node.prev != null) {
                node.prev.next = null;
            } else {
                curNode = null;
            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            Node<T> node = curNode;
            builder.append(node);

            while (node.next != null) {
                node = node.next;
                builder.append(";\n");
                builder.append(node);
            }
            builder.append(".");

            return builder.toString();
        }
    }

    static class Book {
        String author;
        String name;

        Book(String author, String name) {
            this.author = author;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Book { " + "author='" + author + '\'' + ", name='" + name + '\'' + " }";
        }
    }
}
