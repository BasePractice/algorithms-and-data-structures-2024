package ru.mirea.practice.s23k0120.task1.author;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Author author = new Author("Сергей Есенин", "yesenyn@yandex.ru", 'м');

            System.out.println(author);

            System.out.print("Введите имя автора: ");
            String name = sc.nextLine();

            System.out.print("Введите почту: ");
            String email = sc.nextLine();

            System.out.print("Введите пол автора: ");
            char gender = sc.next().charAt(0);

            Author author1 = new Author(name, email, gender);

            System.out.println(author1);

            System.out.print("Введите новую почту: ");

            author1.setEmail(sc.nextLine());

            System.out.println(author1);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}

