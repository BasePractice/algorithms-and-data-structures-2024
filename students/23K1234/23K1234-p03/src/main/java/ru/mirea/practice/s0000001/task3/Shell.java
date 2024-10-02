package ru.mirea.practice.s0000001.task3;

public abstract class Shell {

    public static void main(String[] args) {
        Double doubleObject1 = 10.5;
        String str = "15.75";
        double doubleValue = Double.parseDouble(str);
        System.out.println("Преобразованное значение типа String к типу double: " + doubleValue);

        double primitiveDouble = doubleObject1;
        float primitiveFloat = doubleObject1.floatValue();
        int primitiveInt = doubleObject1.intValue();
        long primitiveLong = doubleObject1.longValue();
        short primitiveShort = doubleObject1.shortValue();
        byte primitiveByte = doubleObject1.byteValue();

        System.out.println("Значение Double в разных примитивных типах:");
        System.out.println("double: " + primitiveDouble);
        System.out.println("float: " + primitiveFloat);
        System.out.println("int: " + primitiveInt);
        System.out.println("long: " + primitiveLong);
        System.out.println("short: " + primitiveShort);
        System.out.println("byte: " + primitiveByte);
        System.out.println("Значение объекта Double: " + doubleObject1);

        String d = Double.toString(3.14);
        System.out.println("Преобразованный литерал double к строке: " + d);
    }
}
