package ru.mirea.practice.s23K0135;

public interface Printable {
    String getTitle();

    static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                System.out.println(printable.getTitle());
            }
        }
    }
}
