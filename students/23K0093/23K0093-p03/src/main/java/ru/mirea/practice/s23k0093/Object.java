package ru.mirea.practice.s23k0093;

public abstract class Object {
    public static void main(String[] args) {
        double obj1 = 10.5;
        double obj2 = 21.72;
        //Преобразование значения типа String к типу double
        String strObj = "15.5";
        double doubleStr = Double.parseDouble(strObj);

        System.out.println("Значения объектов Double:\nпервое число = " + obj1
                + ",\nвторое число = " + obj2 + ",\nОбъект, преобразованный из строки = " + doubleStr);

        //Преобразование объекта класса Double ко всем примитивным типам
        int intDouble = (int) obj1;
        long lgDouble = (long) obj1;
        float fltDouble = (float) obj1;

        System.out.println("\nПриведение обектов типа double в примитивные типы:\n" + "double into int: "
                + intDouble + "\ndouble into long: " + lgDouble + "\ndouble into float: " + fltDouble);

        //Преобразование литерала типа double к строке
        String d = Double.toString(3.14);
        System.out.println("\nПреобразование литерала типа double к строке: " + d);
    }
}