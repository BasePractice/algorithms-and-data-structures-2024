package ru.mirea.practice.s23k0089.task1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Author author1 = new Author("Александр Сергеевич Пушкин", "sanyapushkin@kolotushka.ru", 'm');
            System.out.println(author1);

            System.out.print("Введите имя автора: ");
            String name = sc.nextLine();

            System.out.print("Введите почту: ");
            String email = sc.nextLine();

            System.out.print("Введите пол автора: ");
            char gender = sc.nextLine().charAt(0);

            Author author2 = new Author(name, email, gender);
            System.out.println(author2);

            System.out.print("Введите новую почту: ");
            author2.setEmail(sc.nextLine());

            System.out.println(author2);
        }
    }
}