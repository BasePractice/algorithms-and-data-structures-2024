package ru.mirea.practice.s23L0908.prog8;

public class Magazine implements Printable {
    private final String name;


    String getName() {
        return name;
    }

    Magazine(String name) {
        this.name = name;
    }

    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println(((Magazine) item).getName());
            }
        }
    }
}
