package ru.mirea.practice.s0000001.task6;

public class DoubleWrapperExample {
    public static void main(String[] args) {
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.718");

        String strValue = "5.0";
        double parsedDouble = Double.parseDouble(strValue);

        double primitiveDouble = doubleObject1.doubleValue();
        float primitiveFloat = doubleObject1.floatValue();
        long primitiveLong = doubleObject1.longValue();
        int primitiveInt = doubleObject1.intValue();
        short primitiveShort = doubleObject1.shortValue();

        System.out.println("Объект Double 1: " + doubleObject1);
        System.out.println("Объект Double 2: " + doubleObject2);
        System.out.println("Преобразованный double из строки: " + parsedDouble);
        System.out.println("Примитивный double: " + primitiveDouble);
        System.out.println("Примитивный float: " + primitiveFloat);
        System.out.println("Примитивный long: " + primitiveLong);
        System.out.println("Примитивный int: " + primitiveInt);
        System.out.println("Примитивный short: " + primitiveShort);

        String d = Double.toString(3.14);
        System.out.println("Строковое представление double: " + d);
    }
}
