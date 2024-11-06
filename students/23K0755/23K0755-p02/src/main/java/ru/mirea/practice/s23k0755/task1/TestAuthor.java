package ru.mirea.practice.s23k0755.task1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author2 = new Author("Patricia", "MarryGoRound@gmail.com", 'Ж');
        try (Scanner source = new Scanner(System.in)) {
            String email;
            System.out.println("Введите email ");
            email = source.next();
            author2.setEmail(email);
            System.out.println(author2.toString());
        }
    }
}

