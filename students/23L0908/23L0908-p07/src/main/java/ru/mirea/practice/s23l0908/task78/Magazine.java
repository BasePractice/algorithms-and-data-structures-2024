package ru.mirea.practice.s23l0908.task78;

public final class Magazine {

    private Magazine() {
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            System.out.println(printable.getName());
        }
    }
}

