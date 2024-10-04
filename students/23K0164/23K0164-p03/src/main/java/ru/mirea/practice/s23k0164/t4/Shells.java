package ru.mirea.practice.s23k0164.t4;

public final class Shells {

    private Shells() {

    }

    public static void main(String[] args) {

        Double doubleFromString1 = Double.valueOf("3.14");
        double doubleFromString2 = Double.parseDouble("3.14");
        System.out.println("Объект Double из строки '3.14': " + doubleFromString1);
        System.out.println("Объект Double из строки '3.14': " + doubleFromString2);

        Double doubleObject = 3.14;
        double doubleValue = doubleObject.doubleValue();
        int intValue = (int) doubleValue;
        long longValue = (long) doubleValue;
        float floatValue = (float) doubleValue;
        short shortValue = (short) doubleValue;
        byte byteValue = (byte) doubleValue;

        System.out.println("Исходное значение Double: " + doubleObject);
        System.out.println("Преобразованное значение в double: " + doubleValue);
        System.out.println("Преобразованное значение в int: " + intValue);
        System.out.println("Преобразованное значение в long: " + longValue);
        System.out.println("Преобразованное значение в float: " + floatValue);
        System.out.println("Преобразованное значение в short: " + shortValue);
        System.out.println("Преобразованное значение в byte: " + byteValue);
        String d = Double.toString(3.14);
        System.out.println("Строковое представление числа 3.14: " + d);

    }
}
