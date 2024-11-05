package ru.mirea.practice.s0000001.task9;

public abstract class PrintableApp {
    public static void main(String[] args) {
        // Создаем массив типа Printable
        final int arraySize = 4;
        Printable[] printables = new Printable[arraySize];

        // Заполняем массив книгами и журналами
        printables[0] = new Book("Десять негритят");
        printables[1] = new Magazine("National Geographic");
        printables[2] = new Book("Убийство в Восточном экспрессе");
        printables[3] = new Magazine("Time");

        // В цикле вызываем метод print() для каждого объекта
        for (Printable printable : printables) {
            printable.print();
        }
    }
}