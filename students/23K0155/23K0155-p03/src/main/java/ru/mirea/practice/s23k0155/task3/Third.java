package ru.mirea.practice.s23k0155.task3;

//  Задания на классы Оболочки
// Задание 1
/*
1. Создайте объекты класса Double, используя методы valueOf().
2. Преобразовать значение типа String к типу double. Используем
метод Double.parseDouble().
3. Преобразовать объект класса Double ко всем примитивным типам.
4. Вывести значение объекта Double на консоль.
5. Преобразовать литерал типа double к строке: String d =
        Double.toString(3.14); */
public abstract class Third {
    public static void main(String[] args) {
        // №1
        Double firstObject = Double.valueOf(2);
        Double secondObject = Double.valueOf("45.258");
        System.out.println("\t№1\n" + firstObject);
        System.out.println(secondObject);
        // №2
        double thirdObject = Double.parseDouble("78.5");
        System.out.println("\t№2\n" + thirdObject);
        // №3-4
        double x = 15.5;
        Double doubleObject = x;
        byte byteValue = doubleObject.byteValue();
        short shortValue = doubleObject.shortValue();
        int intValue = doubleObject.intValue();
        long longValue = doubleObject.longValue();
        float floatValue = doubleObject.floatValue();
        double doubleValue = doubleObject;
        boolean booleanValue = doubleObject != 0;   // не 0 = true, если 0, то false
        char charValue = (char) doubleObject.intValue();

        // Вывод результатов
        System.out.println("\n\t№3-4\n");
        System.out.println("Byte:\t" + byteValue);
        System.out.println("Short:\t" + shortValue);
        System.out.println("Int:\t" + intValue);
        System.out.println("Long:\t" + longValue);
        System.out.println("Float:\t" + floatValue);
        System.out.println("Double:\t" + doubleValue);
        System.out.println("Boolean:\t" + booleanValue);
        System.out.println("Char:\t" + charValue);

        // №5
        String d = Double.toString(Math.PI);
        String e = Double.toString(Math.E);
        System.out.println("\n\t№5\n");
        System.out.println("Pi = " + d);
        System.out.println("e = " + e);
    }
}
