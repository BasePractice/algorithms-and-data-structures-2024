package ru.mirea.practice.s23k0362.zadanie1;

public abstract class Obolochki1 {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        //Задание 1
        Double doubleFromstr = Double.valueOf("3.14");
        System.out.println(doubleFromstr);

        double doubleFromprimetive = 2.182818284590452354;
        Double doubleFromdouble = Double.valueOf(String.valueOf(doubleFromprimetive));
        System.out.println(doubleFromdouble);


        System.out.println();
        System.out.println("Задание 2:");
        //Задание 2
        String str = "10011";
        Double d = Double.parseDouble(str);
        System.out.println(d);


        System.out.println();
        System.out.println("Задание 3:");
        //Задание 3
        Double doubleValue = 123.456;

        // Преобразование Double к примитивным типам
        byte byteValue = doubleValue.byteValue();
        short shortValue = doubleValue.shortValue();
        int intValue = doubleValue.intValue();
        long longValue = doubleValue.longValue();
        float floatValue = doubleValue.floatValue();
        double doublePrimitive = doubleValue;

        // Вывод результатов
        System.out.println("Double: " + doubleValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double (primitive): " + doublePrimitive);


        System.out.println();
        System.out.println("Задание 5:");
        //Задание 5
        double pi = 3.14;
        String nm5 = Double.toString(pi);
        System.out.println(nm5);
    }
}
