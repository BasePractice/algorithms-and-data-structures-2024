package ru.mirea.practice.s23k0145.lab7;

public abstract class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = {new Magazine("National Geographic"), new Magazine("Time"),};

        // Вызываем статический метод для вывода журналов
        Magazine.printMagazines(printables);
    }
}
