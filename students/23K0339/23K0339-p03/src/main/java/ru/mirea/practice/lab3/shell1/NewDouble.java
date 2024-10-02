package ru.mirea.practice.lab3.shell1;

public abstract class NewDouble {
    public static void toPrimitive(Double d) {
        float f = d.floatValue();
        int i = d.intValue();
        short s = d.shortValue();
        long l = d.longValue();
        byte b = d.byteValue();
        System.out.println("\nfloat -" + f + "\ninteger -" + i + "\nshort -" + s + "\nlong -" + l + "\nbyte -" + b);

    }

    public static void main(String[] args) {
        Double d = Double.valueOf("1.222");
        System.out.println(d);
        Double dd = 1.333;
        System.out.println(dd);
        Double parseD = Double.parseDouble("1.421");
        System.out.println(parseD);
        toPrimitive(d);
        String st = Double.toString(3.14);
        System.out.println(st);
    }

}
