package ru.mirea.practice.s23k0359.task1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Author author = new Author("Дмитрий Громов", "d.gromov@mail.ru", 'м');

            System.out.println(author);

            System.out.print("Введите имя автора: ");
            String name = sc.nextLine();

            System.out.print("Введите почту автора: ");
            String email = sc.nextLine();

            System.out.print("Введите пол автора: ");
            char gender = sc.next().charAt(0);

            Author firstauthor = new Author(name, email, gender);

            System.out.println(firstauthor);

            System.out.print("Введите новую почту автора: ");

            firstauthor.setEmail(sc.nextLine());

            System.out.println(firstauthor);
        }
    }
}