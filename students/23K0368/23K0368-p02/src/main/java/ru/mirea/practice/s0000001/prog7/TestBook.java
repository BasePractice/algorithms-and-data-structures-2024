package ru.mirea.practice.s0000001.prog7;
import java.util.Scanner;


public abstract class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Lev", "War", 1828, "1200");
        String[] array;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name, title, year, stranichy of the book: ");
            String cmt = sc.nextLine();
            array = cmt.split("\\s");
            String name = array[0];
            String title = array[1];
            Integer year = Integer.parseInt(array[2]);
            String pages = array[3];

            Book book2 = new Book(name, title, year, pages);


            System.out.println("First " + book1.toString());
            System.out.println("Second " + book2.toString());
        }
    }
}
