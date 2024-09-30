package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            String name = scan.next();

            System.out.print("Введите почту: ");
            String email = scan.next();

            System.out.print("Введите гендер: ");
            char gender = scan.next().charAt(0);


            Author author = new Author(name, email, gender);
            System.out.printf("Имя - %s\n", author.getName());
            System.out.printf("Почта - %s\n", author.getEmail());
            System.out.printf("Гендер - %s\n", author.getGender());


            System.out.print("Введите новую почту: ");
            email = scan.next();
            author.setEmail(email);
            System.out.println(author.toString());

        }
    }
}