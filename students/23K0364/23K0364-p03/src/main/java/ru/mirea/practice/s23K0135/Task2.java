package ru.mirea.practice.s23K0135;

public abstract class Task2 {
    public static void main(String[] args) {
        Double obj1 = Double.valueOf(10.5);
        double toDouble = obj1.doubleValue();
        float toFloat = obj1.floatValue();
        int toInt = obj1.intValue();
        long toLong = obj1.longValue();
        short toShort = obj1.shortValue();
        byte toByte = obj1.byteValue();
        System.out.println("Значение obj1: " + obj1);
        String d = Double.toString(3.14);
        System.out.println("Строковое представление 3.14: " + d);
        System.out.println("Преобразовано к double: " + toDouble);
        System.out.println("Преобразовано к float: " + toFloat);
        System.out.println("Преобразовано к int: " + toInt);
        System.out.println("Преобразовано к long: " + toLong);
        System.out.println("Преобразовано к short: " + toShort);
        System.out.println("Преобразовано к byte: " + toByte);
    }
}
