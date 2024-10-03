package ru.mirea.practice.s23k0087.wrappers.task1;

public abstract class Task1 {
    public static void main(String[] args) {

        Double d1 = Double.valueOf(3.14);

        String strNumber = "2.718";
        double parsedDouble = Double.parseDouble(strNumber);

        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        double d = d1.doubleValue();

        System.out.println("Значение d1: " + d1);

        String dstr = Double.toString(3.14);

        System.out.println("Преобразованное значение из строки: " + parsedDouble);
        System.out.println("Преобразованные примитивные типы: " + b + ", " + s + ", " + i + ", " + l + ", " + f + ", " + d);
        System.out.println("Строковое представление double: " + dstr);
    }
}
