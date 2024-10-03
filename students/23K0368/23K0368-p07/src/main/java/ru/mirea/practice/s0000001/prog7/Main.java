package ru.mirea.practice.s0000001.prog7;

public abstract class Main {
    public static void main(String[] args) {
        //пример использования класса
        Printable printable = createPrintable("Top Gear",false);
        printable.print();
        read(new Book("Отцы и дети", "И. Тургенев", 1862));
        read(new Journal("Хакер"));
        System.out.println();

        //руализация функции из задания
        Printable[] printableArray = {new Magazine("National Geographic"),
            new Book("Война и мир", "Л. Толстой", 1828),
            new Magazine("Металлинвест")};

        Magazine.printMagazines(printableArray);
    }

    //статический метод класса
    static void read(Printable p) {
        p.print();
    }

    //статический метод
    static Printable createPrintable(String name, boolean option) {
        if (option) {
            return new Book(name, "неизвестен", 2015);
        } else {
            return new Journal(name);
        }
    }
}
