package ru.mirea.practice.s25k0112.task6;

public class Magazine implements Printable {
    static String kind = "Magazine";
    public String name;

    public Magazine(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable item: printable) {
            if (item instanceof Magazine) {
                item.print();
            }
        }
    }

    public void print() {
        System.out.printf("Kind: %s\nName: %s\n\n", kind, name);
    }
}

