package ru.mirea.practice.s0000001.task2;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static void main(String[] args) {
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.71");

        String doubleString = "1.618";
        double primitiveDouble = Double.parseDouble(doubleString);

        int intValue = doubleObject1.intValue();
        long longValue = doubleObject1.longValue();
        float floatValue = doubleObject1.floatValue();
        byte byteValue = doubleObject1.byteValue();

        System.out.println("Объект Double 1: " + doubleObject1);
        System.out.println("Объект Double 2: " + doubleObject2);
        System.out.println("Преобразованное значение типа String к double: " + primitiveDouble);
        System.out.println("Примитивный int из Double: " + intValue);
        System.out.println("Примитивный long из Double: " + longValue);
        System.out.println("Примитивный float из Double: " + floatValue);
        System.out.println("Примитивный byte из Double: " + byteValue);

        String d = Double.toString(3.14);
        System.out.println("Литерал типа double в строке:  " + d);
    }
}