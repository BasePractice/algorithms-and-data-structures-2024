package ru.mirea.practice.s0000001.prog1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("men", "111", '1');

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the name of the author");
            String name = sc.nextLine();

            System.out.println("Enter the eamil of the author");
            String email = sc.nextLine();

            System.out.println("Enter the gender of the author");
            char gender = sc.nextLine().charAt(0);

            Author author1 = new Author(name, email, gender);

            System.out.println("Enter the Author of the author" + author + author1);
        }
    }
}
