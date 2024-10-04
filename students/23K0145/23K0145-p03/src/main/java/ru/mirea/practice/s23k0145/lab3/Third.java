package ru.mirea.practice.s23k0145.lab3;

public abstract class Third {
    public static void main(String[] args) {
        // 1. Создаем объекты класса Double, используя метод valueOf()
        Double doubleObj1 = Double.valueOf(10.5);

        // 2. Преобразуем значение типа String к типу double
        String str = "30.25";
        double doubleValue = Double.parseDouble(str);

        // 3. Преобразуем объект класса Double ко всем примитивным типам
        byte byteValue = doubleObj1.byteValue();
        short shortValue = doubleObj1.shortValue();
        int intValue = doubleObj1.intValue();
        long longValue = doubleObj1.longValue();
        float floatValue = doubleObj1.floatValue();
        double primitiveDoubleValue = doubleObj1.doubleValue();

        // 4. Вывод значения объекта Double на консоль
        System.out.println("Double object: " + doubleObj1);
        System.out.println("Converted double value from String: " + doubleValue);

        // Преобразованные значения к примитивным типам
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + primitiveDoubleValue);

        // 5. Преобразуем литерал типа double к строке
        String doubleToStr = Double.toString(3.14);
        System.out.println("Double literal to String: " + doubleToStr);
    }
}

