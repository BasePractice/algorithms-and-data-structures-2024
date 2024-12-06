package ru.mirea.practice.s23l0908.task6789;

import java.util.Scanner;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How many books we'll put on the shelf? ");
            int average = input.nextInt();
            BookShelf shelf = new BookShelf(average);

            System.out.println("You can /add book to the bookshelf. "
                + "After adding a few books, you'll be able to get /earliest and /latest book from the shelf.\n"
                + "You also could /sort books on your shelf. Type /show to see the whole list of books.");
            String cmd = "";
            while (!"/end".equals(cmd)) {
                cmd = input.nextLine();
                if (cmd.startsWith("/add")) {
                    System.out.print("name: ");
                    final String name = input.nextLine();
                    System.out.print("author: ");
                    final String author = input.nextLine();
                    System.out.print("published by: ");
                    final String publishedBy = input.nextLine();
                    System.out.print("released: ");
                    final int released = input.nextInt();
                    input.nextLine(); // Consume newline

                    if (shelf.add(name, author, publishedBy, released)) {
                        System.out.println("Successfully added.");
                    } else {
                        System.out.println("Your shelf is full, or you already have this book.");
                    }
                } else if (cmd.startsWith("/earliest")) {
                    System.out.println(shelf.getEarliest());
                } else if (cmd.startsWith("/latest")) {
                    System.out.println(shelf.getLatest());
                } else if (cmd.startsWith("/show")) {
                    System.out.print(shelf);
                } else if (cmd.startsWith("/sort")) {
                    shelf.sort();
                    System.out.println("SORTED!");
                    System.out.print(shelf);
                }
            }
        }
    }
}

