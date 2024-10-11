package ru.mirea.practice.s23L0908.Task6_7_8_9;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many books we'll put on the shelf? ");
        int average = input.nextInt();
        BookShelf shelf = new BookShelf(average);

        System.out.println("You can /add book to the bookshelf. " +
            "After adding few books, you'll be able to get /earliest and /latest book from the shelf.\n" +
            "You also could /sort books on your shelf. Type /show to see whole list of computers.");
        String cmd = "";
        while (!cmd.equals("/end")) {
            cmd = input.nextLine();
            if (cmd.startsWith("/add")) {
                System.out.print("name: ");
                String name = input.nextLine();
                System.out.print("author: ");
                String author = input.nextLine();
                System.out.print("published by: ");
                String published_by = input.nextLine();
                System.out.print("realesed: ");
                int realesed = input.nextInt();

                if (shelf.add(name, author, published_by, realesed)){
                    System.out.println("Successfully added.");
                }
                else{
                    System.out.println("Your shelf is filled or you already have this book.");
                }
            } else if (cmd.startsWith("/earliest")) {
                System.out.println(shelf.getEarliest().toString());
            } else if (cmd.startsWith("/latest")) {
                System.out.println(shelf.getLatest().toString());
            } else if (cmd.startsWith("/show")) {
                System.out.print(shelf.toString());
            } else if (cmd.startsWith("/sort")) {
                shelf.sort();
                System.out.println("SOTRED!");
                System.out.print(shelf.toString());
            }
        }
    }
}
