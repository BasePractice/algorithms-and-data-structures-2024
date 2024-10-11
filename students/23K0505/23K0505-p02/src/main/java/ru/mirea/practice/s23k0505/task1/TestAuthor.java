package ru.mirea.practice.s23k0505.task1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Илья", "ilya2007@mail.ru", 'м');
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            author.setName(sc.nextLine());
            System.out.print("Введите почту: ");
            author.setEmail(sc.nextLine());
            System.out.print("Введите пол: ");
            author.setEmail(sc.next().charAt(0));

            System.out.println("Имя: " + author.getName());
            System.out.println("Почта: " + author.getEmail());
            System.out.println("Пол: " + author.getGender());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
