package ru.mirea.practice.s23k0116.wrapper;

public abstract class Main {
    public static void main(String[] args) {
        Double doublenum = Double.valueOf(102.53);
        Double expform = Double.valueOf("1.23e3");

        System.out.println(doublenum);
        System.out.println(expform);

        Double doubleObject = Double.parseDouble("34.211");


        double doubleValue = doubleObject.doubleValue();
        float floatValue = doubleObject.floatValue();
        int intValue = doubleObject.intValue();
        long longValue = doubleObject.longValue();
        short shortValue = doubleObject.shortValue();
        byte byteValue = doubleObject.byteValue();

        System.out.println("double: " + doubleValue + "\n"
                + "float: " + floatValue + "\n"
                + "int: " + intValue + "\n"
                + "long: " + longValue + "\n"
                + "short: " + shortValue + "\n"
                + "byte: " + byteValue);
        System.out.println(doubleObject);

        String d = Double.toString(3.14);
        System.out.println("d: " + d);
    }
}
