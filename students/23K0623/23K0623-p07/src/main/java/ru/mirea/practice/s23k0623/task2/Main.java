package ru.mirea.practice.s23k0623.task2;

public abstract class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {
            new Book("The Great Gatsby"),
            new Magazine("National Geographic"),
            new Book("1984"),
            new Magazine("TIME")
        };

        System.out.println("List of magazines:");
        Magazine.printMagazines(printables);
    }
}

