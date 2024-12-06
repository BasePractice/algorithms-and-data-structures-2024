package ru.mirea.practice.s23l0908.taskclass;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        String str = "9.42";
        double primitive = Double.parseDouble(str);
        System.out.println("Converted String to double: " + primitive);

        double doubleObj = 7.56;
        byte byteValue = (byte) doubleObj;
        short shortValue = (short) doubleObj;
        int intValue = (int) doubleObj;
        long longValue = (long) doubleObj;
        float floatValue = (float) doubleObj;
        double doubleValue = doubleObj;


        System.out.println("Double to byte: " + byteValue);
        System.out.println("Double to short: " + shortValue);
        System.out.println("Double to int: " + intValue);
        System.out.println("Double to long: " + longValue);
        System.out.println("Double to float: " + floatValue);
        System.out.println("Double to double: " + doubleValue);

        String d = Double.toString(3.14);
        System.out.println("Double literal to String: " + d);
    }
}

