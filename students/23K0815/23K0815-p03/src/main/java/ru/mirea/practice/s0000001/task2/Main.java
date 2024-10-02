package ru.mirea.practice.s0000001.task2;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static void main(String[] args) {
        double doubleValue1 = 3.14;
        double doubleValue2 = Double.parseDouble("2.71");

        String doubleString = "1.618";
        double primitiveDouble = Double.parseDouble(doubleString);

        System.out.println("Primitive double 1: " + doubleValue1);
        System.out.println("Primitive double 2: " + doubleValue2);
        System.out.println("Преобразованное значение типа String к double: " + primitiveDouble);

        int intValue = (int) doubleValue1;
        long longValue = (long) doubleValue1;
        float floatValue = (float) doubleValue1;
        byte byteValue = (byte) doubleValue1;

        System.out.println("Примитивный int из double: " + intValue);
        System.out.println("Примитивный long из double: " + longValue);
        System.out.println("Примитивный float из double: " + floatValue);
        System.out.println("Примитивный byte из double: " + byteValue);

        String d = Double.toString(3.14);
        System.out.println("Литерал типа double в строке: " + d);
    }
}