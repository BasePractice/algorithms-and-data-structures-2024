package ru.mirea.practice.s23k0143;

public abstract class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = new Printable[]{
            new Book("Унесенные ветром", "Маргарет Миттчел"),
            new Book("Темная башня", "Стивен Кинг"),
            new Book("Ангелы и демоны", "Ден Браун"),
            new Magazine("Моя Москва", 102),
            new Magazine("Forbes", 107)
        };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
