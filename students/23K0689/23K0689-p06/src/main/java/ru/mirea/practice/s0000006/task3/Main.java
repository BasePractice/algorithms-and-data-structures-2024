package ru.mirea.practice.s0000006.task3;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        System.out.println("List of Nameable Objects:");

        Nameable book1 = new Book("The Hitchhiker's Guide to the Galaxy");
        printNameWithType("Book", book1);

        Nameable ship1 = new Ship("USS Enterprise");
        printNameWithType("Ship", ship1);

        Nameable software1 = new Software("IntelliJ IDEA");
        printNameWithType("Software", software1);

        Nameable book2 = new Book("Dune");
        printNameWithType("Book", book2);

        Nameable ship2 = new Ship("Black Pearl");
        printNameWithType("Ship", ship2);

        Nameable software2 = new Software("Visual Studio Code");
        printNameWithType("Software", software2);
    }

    private static void printNameWithType(String type, Nameable nameable) {
        System.out.printf("%-10s : %s%n", type, nameable.getName());
    }
}
