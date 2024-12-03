package ru.mirea.practice.s0000001.obolochk;

public abstract class Task1 {
    public static void main(String[] args) {
        Double dubl = Double.valueOf(30);
        dubl = Double.parseDouble("001.01");
        System.out.println("double after parse=" + dubl);
        System.out.println("byte value=" + dubl.byteValue());
        System.out.println("short value=" + dubl.shortValue());
        System.out.println("int value=" + dubl.intValue());
        System.out.println("long value=" + dubl.longValue());
        System.out.println("float value=" + dubl.floatValue());
        System.out.println("double value=" + dubl.doubleValue());
        char c = (char) 30.0;
        System.out.println("char value=" + c);
        if (dubl != null) {
            System.out.println("boolean value=" + true);
        }
        if (dubl == null) {
            System.out.println("boolean value=" + false);
        }
        System.out.println("vals of double=" + dubl);
        System.out.println("pi string");
        System.out.println(Double.toString(Math.PI));
    }
}
