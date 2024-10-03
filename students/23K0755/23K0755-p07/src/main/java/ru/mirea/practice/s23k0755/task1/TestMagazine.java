package ru.mirea.practice.s23k0755.task1;

public abstract class TestMagazine {
    public static void main(String[] args) {
        Printable[] printables = {
            new Magazine("Forbes"),
            new Magazine("Hello!"),
        };

        Magazine.printMagazines(printables);
    }
}
