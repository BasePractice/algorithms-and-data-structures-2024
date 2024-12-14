package ru.mirea.practice.s23l0908.task123;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Client client = new Client();
            System.out.println("Enter name: ");
            String name = in.nextLine();
            System.out.println("Enter inn: ");
            try {
                int inn = in.nextInt();
                if (!client.getName().equals(name) || client.getInn() != inn) {
                    throw new RuntimeException("Invalid client information!");
                } else {
                    System.out.println("Success!");
                }
            } catch (RuntimeException error) {
                System.out.println(error.getMessage());
            }
        }
    }
}

