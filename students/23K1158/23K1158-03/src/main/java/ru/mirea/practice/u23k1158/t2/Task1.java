package ru.mirea.practice.u23k1158.t2;

public abstract class Task1 {
    public static void main(String[] args) {
        Double num1 = Double.valueOf(55.55);
        Double num2 = Double.valueOf("3.33e3");
        System.out.println(num1);
        System.out.println(num2);
        Double num3 = Double.parseDouble("66.56");

        double doubleNum = num3.doubleValue();
        float floatNum = num3.floatValue();
        int intNum = num3.intValue();
        long longNum = num3.longValue();
        short shortNum = num3.shortValue();
        byte byteNum = num3.byteValue();

        System.out.println("double: " + doubleNum + "\n"
                + "float: " + floatNum + "\n"
                + "int: " + intNum + "\n"
                + "long: " + longNum + "\n"
                + "short: " + shortNum + "\n"
                + "byte: " + byteNum);
        String d = Double.toString(3.14);
        System.out.println("d: " + d);
    }
}

