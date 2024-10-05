package ru.mirea.practice.s23L0908.task7and8;

public interface Printable {
    void print();

    static void printMagazines(Printable[] printable) {
        for (Printable x : printable) {
            if (x instanceof Magazines) {
                System.out.println(((Magazines) x).getTitle());
            }
        }
    }
}
