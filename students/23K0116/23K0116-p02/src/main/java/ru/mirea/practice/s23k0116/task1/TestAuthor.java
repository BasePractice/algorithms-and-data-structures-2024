package ru.mirea.practice.s23k0116.task1;

//import java.lang.*;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Ivan", "vanek.kazekage@gmail.ru", 'm');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        author.setEmail("raddan@gmail.com");

        System.out.println(author);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите изменённую почту:");
            author.setEmail(sc.nextLine());
        }
        System.out.println(author);
    }
}