package ru.mirea.practice.s0000001;

public abstract class ClassDouble {
    public static void main(String[] args) {
        double num1 = 1.23;
        double num2 = 4.56;

        String str = "7.89";
        double doubleStr = Double.parseDouble(str);

        System.out.println("Значения объектов Double:\nnum1 = " + num1
                + ",\nnum2 = " + num2 + ",\nОбъект, преобразованный из строки = " + doubleStr);

        int intDouble = (int) num1;
        float fltDouble = (float) num1;
        long lngDouble = (long) num1;

        System.out.println("\nПриведение обектов типа double в примитивные типы:\n" + "double -> int: "
                + intDouble + "\ndouble -> float: " + fltDouble + "\ndouble -> long: " + lngDouble);

        String d = Double.toString(3.14);
        System.out.println("\nПреобразование литерала типа double к строке: " + d);

    }
}
