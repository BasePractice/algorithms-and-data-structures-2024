package ru.mirea.practice.s0000001;

import java.util.Scanner;

/**
 * Реализовать простейшую картотеку в виде консольного приложения. Программа должна включать:
 * 1. Класс, описывающий узел списка - элемент картотеки (студент, служащий, товар и т.п.). Содержит атрибуты,
 * описывающие элемент (имя, возраст и т.п.) и 2 функции, позволяющие:
 * a. считать атрибуты объекта с консоли ;
 * b. вывести атрибуты на экран ;
 */

public abstract class Task1 {
    public static void main(String[] args) {
        List list = new List();

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                list.addEl(new Book(sc.nextLine(), sc.nextLine()));
            }
        }

        System.out.println(list);
    }

    static class Node {
        Node next;
        Node prev;
        Book book;

        Node(Book book) {
            this(book, null, null);
        }

        Node(Book book, Node next, Node prev) {
            this.book = book;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return book.toString();
        }
    }

    static class List {
        Node curNode;

        List() {
            curNode = null;
        }

        void addEl(Book book) {
            if (curNode == null) {
                curNode = new Node(book);
                return;
            }

            Node nn = new Node(book);
            Node node = curNode;
            while (node.next != null) {
                node = node.next;
            }
            nn.prev = node;
            node.next = nn;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            Node node = curNode;
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
