package ru.mirea.practice.s23k0140.wrapper;

public abstract class Main {
    public static void main(String[] args) {
        Double doubleValue1 = Double.valueOf(6.34);
        Double doubleValue2 = Double.valueOf("7.35");

        String strValue = "5.243";
        double doubleFromString = Double.parseDouble(strValue);

        double primitiveDouble = doubleValue1.doubleValue();
        float primitiveFloat = doubleValue1.floatValue();
        long primitiveLong = doubleValue1.longValue();
        int primitiveInt = doubleValue1.intValue();
        short primitiveShort = doubleValue1.shortValue();
        byte primitiveByte = doubleValue1.byteValue();

        System.out.println("Значение объекта Double (doubleValue1): " + doubleValue1);
        System.out.println("Значение объекта Double (doubleValue2): " + doubleValue2);

        String d = Double.toString(6.34);
        System.out.println("Строковое представление литерала double: " + d);

        System.out.println("Преобразование объекта Double к примитивным типам:");
        System.out.println("double: " + primitiveDouble);
        System.out.println("float: " + primitiveFloat);
        System.out.println("long: " + primitiveLong);
        System.out.println("int: " + primitiveInt);
        System.out.println("short: " + primitiveShort);
        System.out.println("byte: " + primitiveByte);

        System.out.println("Значение, преобразованное из строки: " + doubleFromString);
    }
}