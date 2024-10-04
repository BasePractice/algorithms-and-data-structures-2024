package ru.mirea.practice.s23k0114.lab2;

import java.util.Scanner;
//import java.lang.String;

public abstract class Task1TestAuthor {
    public static void main(String[] args) {

        Task1Author human = new Task1Author("Author", "No data", 'M');
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