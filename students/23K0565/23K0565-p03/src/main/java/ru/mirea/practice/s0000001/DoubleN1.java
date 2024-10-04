package ru.mirea.practice.s0000001;

public abstract class DoubleN1 {
    public static void main(String[] args) {
        Double doubleObj = Double.valueOf("3.14");
        double primitiveDouble = Double.parseDouble("3.14");
        byte byteValue = doubleObj.byteValue();
        short shortValue = doubleObj.shortValue();
        int intValue = doubleObj.intValue();
        long longValue = doubleObj.longValue();
        float floatValue = doubleObj.floatValue();

        System.out.println("Объект Double: " + doubleObj);
        System.out.println("Примитивный double: " + primitiveDouble);
        System.out.println("byteValue: " + byteValue);
        System.out.println("shortValue: " + shortValue);
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println("floatValue: " + floatValue);

        String strValue = Double.toString(3.14);
        System.out.println("Строковое представление: " + strValue);
    }
}