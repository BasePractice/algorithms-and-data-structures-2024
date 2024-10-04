package ru.mirea.practice.s23k0169.shells.t3;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Double doubleObject = 45.67;

        double doubleValue = doubleObject.doubleValue();
        float floatValue = doubleObject.floatValue();
        long longValue = doubleObject.longValue();
        int intValue = doubleObject.intValue();
        short shortValue = doubleObject.shortValue();
        byte byteValue = doubleObject.byteValue();

        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("long: " + longValue);
        System.out.println("int: " + intValue);
        System.out.println("short: " + shortValue);
        System.out.println("byte: " + byteValue);
    }
}
