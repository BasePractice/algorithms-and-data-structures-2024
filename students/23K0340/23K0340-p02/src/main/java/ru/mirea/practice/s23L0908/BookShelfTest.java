package ru.mirea.practice.s23L0908;

import java.util.Scanner;

public abstract class BookShelfTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BookShelf bs = new BookShelf(5);
            Book book;
            String auth;
            String name;
            int year;
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter author:");
                auth = sc.nextLine();
                System.out.println("Enter name:");
                name = sc.nextLine();
                System.out.println("Enter year:");
                year = sc.nextInt();
                book = new Book(auth, name, year);
                bs.addBook(book);
            }
            System.out.println(bs.earliest().getName());
            bs.sort();
            System.out.println(bs.getBook(0).getYear());
        }
    }
}
