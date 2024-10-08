package ru.mirea.practice.s23K0135.task7and8;

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
