package task3;

public class Main {
    public static void main(String[] args) {
        Nameable book1 = new Book("The Hitchhiker's Guide to the Galaxy");
        Nameable ship1 = new Ship("USS Enterprise");
        Nameable software1 = new Software("IntelliJ IDEA");
        Nameable book2 = new Book("Dune");
        Nameable ship2 = new Ship("Black Pearl");
        Nameable software2 = new Software("Visual Studio Code");

        System.out.println("List of Nameable Objects:");
        printNameWithType("Book", book1);
        printNameWithType("Ship", ship1);
        printNameWithType("Software", software1);
        printNameWithType("Book", book2);
        printNameWithType("Ship", ship2);
        printNameWithType("Software", software2);
    }

    private static void printNameWithType(String type, Nameable nameable) {
        System.out.printf("%-10s : %s%n", type, nameable.getName());
    }
}