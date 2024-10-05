package ru.mirea.practice.s23L0908;

// Это задание №1 на оболочки

public final class Ex4 {

    private Ex4() {
        // Тут всё ещё пусто
    }

    public static void main(String[] args) {

        Double doubleObj1 = Double.valueOf(12.3);
        Double doubleObj2 = Double.valueOf("45.6");

        String str = "2.23";
        double primitiveDouble = Double.parseDouble(str);

        double doubleValue = doubleObj1.doubleValue();
        byte byteValue = doubleObj1.byteValue();
        short shortValue = doubleObj1.shortValue();
        int intValue = doubleObj1.intValue();
        long longValue = doubleObj1.longValue();
        float floatValue = doubleObj1.floatValue();

        System.out.println("Значение объекта 1: " + doubleObj1);
        System.out.println("Значение объекта 2: " + doubleObj2);

        String doubleToStr = Double.toString(7.89);
        System.out.println("Преобразование литерала double к строке: " + doubleToStr);

        System.out.println("Преобразование объекта Double:");
        System.out.println("double: " + doubleValue);
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);

        System.out.println("Значение из строки: " + primitiveDouble);
    }
}
