package ru.mirea.practice.s23K0135;


public abstract class Oboloch {
    public static void main(String[] args) {
        Double obj1 = Double.valueOf(3.14);
        Double obj2 = Double.valueOf(5.42);

        String st = "5.42";
        double parsDouble = Double.parseDouble(st);


        float primitiveFloat = obj1.floatValue();
        long primitiveLong = obj1.longValue();
        int primitiveInt = obj1.intValue();
        short primitiveShort = obj1.shortValue();
        byte primitiveByte = obj1.byteValue();

        System.out.printf("Объект 1: %.2f\n", obj1);
        System.out.printf("Объект 2: %.2f\n", obj2);
        System.out.printf("Преобразованное значение из строки: %.2f\n", parsDouble);

        System.out.printf("Примитивный float: %.2f\n", primitiveFloat);
        System.out.printf("Примитивный long: %d\n", primitiveLong);
        System.out.printf("Примитивный int: %d\n", primitiveInt);
        System.out.printf("Примитивный short: %d\n", primitiveShort);
        System.out.printf("Примитивный byte: %d\n", primitiveByte);


        String d = Double.toString(3.14);
        System.out.printf("Литерал типа double как строка: %s\n", d);
    }
}
