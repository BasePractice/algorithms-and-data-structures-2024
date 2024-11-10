package ru.mirea.practice.u23k1158.t1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Oorzhak", "toolky@gmail.com", 'M');
        System.out.println(author);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите почту:");
            author.setEmail(sc.nextLine());
        }
        System.out.println(author);
    }
}
