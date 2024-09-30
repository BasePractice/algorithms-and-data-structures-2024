package ru.mirea.practice3;

public class Four {

    public static void main(String[] args) {

        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.718");

        System.out.println("Значение doubleObject1: " + doubleObject1);
        System.out.println("Значение doubleObject2: " + doubleObject2);

        String stringValue = "123.456";
        double primitiveDouble = Double.parseDouble(stringValue);
        System.out.println("Преобразованное значение из строки: " + primitiveDouble);

        double primitiveDoubleValue = doubleObject1.doubleValue();
        float primitiveFloatValue = doubleObject1.floatValue();
        int primitiveIntValue = doubleObject1.intValue();
        long primitiveLongValue = doubleObject1.longValue();
        short primitiveShortValue = doubleObject1.shortValue();
        byte primitiveByteValue = doubleObject1.byteValue();

        System.out.println("Преобразование к типу double: " + primitiveDoubleValue);
        System.out.println("Преобразование к типу float: " + primitiveFloatValue);
        System.out.println("Преобразование к типу int: " + primitiveIntValue);
        System.out.println("Преобразование к типу long: " + primitiveLongValue);
        System.out.println("Преобразование к типу short: " + primitiveShortValue);
        System.out.println("Преобразование к типу byte: " + primitiveByteValue);

        System.out.println("Значение doubleObject1 (из задания 1): " + doubleObject1);

        String d = Double.toString(3.14);
        System.out.println("Преобразованный литерал double к строке: " + d);
    }
}

