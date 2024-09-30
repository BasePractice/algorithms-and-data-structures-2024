package ru.mirea.practice.s23k0823.task7;

public abstract class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Айзек Азимов", "Я робот", 1950);
        Book book2 = new Book("Рей Бредбери", "451 по фаренгейту", 1953);
        Book book3 = new Book("Рей Бредбери", "Вино из одуванчиков", 1957);

        System.out.println("Книга 1: " + book1.toString());
        System.out.println("Книга 2: " + book2.toString());
        System.out.println("Книга 3: " + book3.toString());
    }
}