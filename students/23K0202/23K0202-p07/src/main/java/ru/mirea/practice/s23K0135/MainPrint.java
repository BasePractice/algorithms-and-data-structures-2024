package ru.mirea.practice.s23K0135;

public abstract class MainPrint {
    public static void main(String[] args) {
        Printable[] printables = new Printable[] {new Magazine("Vogue"), new Magazine("Glamour"), new Magazine("Forbes"), new Book("Война и мир")};

        Printable.printMagazines(printables);
    }
}
