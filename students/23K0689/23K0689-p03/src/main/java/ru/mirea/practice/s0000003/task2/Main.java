package ru.mirea.practice.s0000003.task2;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {

        // 1. Создайте объекты класса Double, используя методы valueOf()
        Double doubleObj1 = Double.valueOf(10.5);

        // 2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble()
        String strValue = "30.25";
        double parsedValue = Double.parseDouble(strValue);

        // 3. Преобразовать объект класса Double ко всем примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        int primitiveInt = doubleObj1.intValue();
        float primitiveFloat = doubleObj1.floatValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();

        // 4. Вывести значение объекта Double на консоль
        System.out.println("Значение doubleObj1: " + doubleObj1);

        // 5. Преобразовать литерал типа double к строке
        String d = Double.toString(3.14);
        System.out.println("Преобразованный литерал double к строке: " + d);

        // Дополнительный вывод для наглядности
        System.out.println("Преобразованный String к double: " + parsedValue);
        System.out.println("Double ко всем примитивным типам:");
        System.out.println("double: " + primitiveDouble);
        System.out.println("int: " + primitiveInt);
        System.out.println("float: " + primitiveFloat);
        System.out.println("long: " + primitiveLong);
        System.out.println("short: " + primitiveShort);
        System.out.println("byte: " + primitiveByte);
    }
}