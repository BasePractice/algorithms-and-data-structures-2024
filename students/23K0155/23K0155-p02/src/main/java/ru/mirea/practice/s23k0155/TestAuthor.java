package ru.mirea.practice.s23k0155;

import java.util.Scanner;
//import java.lang.String;

public abstract class TestAuthor {
    public static void main(String[] args) {

        Author human = new Author("Author", "No data", 'M');
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println(human.toString());

            System.out.print("Enter new mail:");
            human.setEmail(scanner.nextLine());
            System.out.print("Enter new author's name:");
            human.setName(scanner.nextLine());

            System.out.println("New data^\n" + human.toString());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}