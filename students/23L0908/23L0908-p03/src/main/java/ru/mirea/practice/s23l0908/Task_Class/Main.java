package ru.mirea.practice.s23l0908.Task_Class;

public class Main {
    public static void main(String[] args) {
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("6.28");
        String str = "9.42";
        double primitive = Double.parseDouble(str);
        System.out.println("Converted String to double: " + primitive);
        Double doubleObj = 7.56;
        byte byteValue = doubleObj.byteValue();
        short shortValue = doubleObj.shortValue();
        int intValue = doubleObj.intValue();
        long longValue = doubleObj.longValue();
        float floatValue = doubleObj.floatValue();
        double doubleValue = doubleObj.doubleValue();
        System.out.println("Double to byte: " + byteValue);
        System.out.println("Double to short: " + shortValue);
        System.out.println("Double to int: " + intValue);
        System.out.println("Double to long: " + longValue);
        System.out.println("Double to float: " + floatValue);
        System.out.println("Double to double: " + doubleValue);

        System.out.println("Value of Double obj: " + doubleObj);

        String d = Double.toString(3.14);
        System.out.println("Double literal to String: " + d);
    }
}
