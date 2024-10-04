package ru.mirea.practice.s0000001.n1;

import java.util.Scanner;

public abstract class TestAuthor {
    public static void main(String[] args) {

        Author author = new Author("John Doe", "john@example.com", 'M');

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the name of the author:");
            String name = sc.nextLine();

            System.out.println("Enter the email of the author:");
            String email = sc.nextLine();

            System.out.println("Enter the gender of the author (M/F):");
            char gender = sc.nextLine().charAt(0);

            Author newAuthor = new Author(name, email, gender);

            System.out.println("Original Author: " + author);
            System.out.println("New Author: " + newAuthor);
        }
    }
}