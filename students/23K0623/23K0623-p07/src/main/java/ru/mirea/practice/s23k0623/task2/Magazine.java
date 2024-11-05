package ru.mirea.practice.s23k0623.task2;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine title: " + title);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                Magazine magazine = (Magazine) printable;
                System.out.println(magazine.title);
            }
        }
    }
}

