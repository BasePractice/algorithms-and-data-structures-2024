package ru.mirea.practice.s23k0112;

import java.util.Scanner;

public final class TestAuthor {
    private TestAuthor() {

    }

    public static void main(String[] args) {
        Author author = new Author("John", "johnny@mail.ru", 'M');
        System.out.println("Имя автора: " + author.getName());
        System.out.println("Почта автора: " + author.getEmail());
        System.out.println("Пол автора: " + author.getGender());

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nВведите новую почту:");
            String email = scanner.next();
            author.setEmail(email);
            System.out.println(author);
        }
    }
}