package ru.mirea.practice.s23k0145.lab2.task1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Anton", "erov.a.v@edu.mirea.ru", 'M');

        System.out.println(author);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите изменённую почту:");
            author.setEmail(sc.nextLine());
        }
        System.out.println(author);
    }
}