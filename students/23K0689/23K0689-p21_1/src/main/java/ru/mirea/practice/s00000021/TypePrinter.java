package ru.mirea.practice.s00000021;

public final class TypePrinter { // final - класс не может быть унаследован

    // Приватный конструктор предотвращает создание экземпляров класса
    private TypePrinter() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void printType(Object obj) {
        if (obj != null) {
            System.out.println("Тип объекта: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("Объект равен null.");
        }
    }

    public static void main(String[] args) {
        printType(123);
        printType("Hello");
        printType(null);
    }
}
