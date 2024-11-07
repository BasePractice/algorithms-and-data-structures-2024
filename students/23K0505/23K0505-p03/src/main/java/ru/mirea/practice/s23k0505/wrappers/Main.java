package ru.mirea.practice.s23k0505.wrappers;

public abstract class Main {
    public static void main(String[] args) {
        Double num = 3.1415926535 * 1000;
        Double inf = Double.valueOf("Infinity");

        System.out.println(inf);

        String eStr = "2.718281828459045";
        double eConst = Double.parseDouble(eStr);

        System.out.println(eConst);

        int intFromDouble = num.intValue();
        byte byteFromDouble = num.byteValue();
        float floatFromDouble = num.floatValue();
        long longFromDouble = num.longValue();
        short shortFromDouble = num.shortValue();
        double doubleFromDouble = num;

        System.out.printf("int: %d \nbyte: %d \nfloat: %f \nlong: %d \nshort: %d \ndouble: %f\n",
                intFromDouble, byteFromDouble, floatFromDouble, longFromDouble, shortFromDouble, doubleFromDouble);

        System.out.println(num);

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}
