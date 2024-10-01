package ru.mirea.practice.s23k0362;

abstract class Covers {
    public static void main(String[] args) {
        /*
        1. Создайте объекты класса Double, используя методы valueOf().
        2. Преобразовать значение типа String к типу double. Используем
        метод Double.parseDouble().
        3. Преобразовать объект класса Double ко всем примитивным типам.
        4. Вывести значение объекта Double на консоль.
        5. Преобразовать литерал типа double к строке: String d = Double.toString(3.14)
        */
        String str1 = "4.3443";
        Double db1 = Double.valueOf(str1);
        System.out.println("Преобрауем с помощью valueOf > " + db1);
        double db2 = Double.parseDouble(str1);
        System.out.println("Преобрауем с помощью Double.parseDouble > " + db2);
        byte bSpec = db1.byteValue();
        System.out.println("Примитив byte > " + bSpec);
        short sSpec = db1.shortValue();
        System.out.println("Примитив short > " + sSpec);
        int iSpec = db1.intValue();
        System.out.println("Примитив int > " + iSpec);
        long lSpec = db1.longValue();
        System.out.println("Примитив long > " + lSpec);
        float fSpec = db1.floatValue();
        System.out.println("Примитив fSpec > " + fSpec);
        double dSpec = db1;
        System.out.println("Примитив double > " + dSpec);
        String spec5 = Double.toString(3.14);
        System.out.println("Строка от Double > " + spec5);
    }
}
