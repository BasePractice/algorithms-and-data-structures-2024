package ru.mirea.practice.s0000001.task2;

/**
 * Класс Main демонстрирует преобразование значений между примитивными типами
 * данных и их представлением в виде строк.
 */
public abstract class Main {
    public static void main(String[] args) {
        double doubleValue1 = 10.5; // Использование примитивного типа double
        String str = "15.75";

        // Преобразование строки в примитивный тип double
        double doubleValue2 = Double.parseDouble(str);
        System.out.println("Преобразованное значение типа String к типу double: " + doubleValue2);

        // Другие преобразования
        float primitiveFloat = (float) doubleValue1;
        int primitiveInt = (int) doubleValue1;
        long primitiveLong = (long) doubleValue1;
        short primitiveShort = (short) doubleValue1;
        byte primitiveByte = (byte) doubleValue1;

        System.out.println("Значение Double в разных примитивных типах:");
        System.out.println("double: " + doubleValue1);
        System.out.println("float: " + primitiveFloat);
        System.out.println("int: " + primitiveInt);
        System.out.println("long: " + primitiveLong);
        System.out.println("short: " + primitiveShort);
        System.out.println("byte: " + primitiveByte);

        // Прямое преобразование литерала double в строку
        String d = Double.toString(3.14);
        System.out.println("Преобразованный литерал double к строке: " + d);
    }
}