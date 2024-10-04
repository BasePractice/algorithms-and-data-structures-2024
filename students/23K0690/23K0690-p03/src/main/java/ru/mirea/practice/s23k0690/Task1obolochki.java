package ru.mirea.practice.s23k0690;

public final class Task1obolochki {
    private Task1obolochki() {
    }

    public static void main(String[] args) {
        Double d1 = 1.23;

        String s = "4.56";
        double p = Double.parseDouble(s);

        double t1 = d1;
        int t2 = d1.intValue();
        float t3 = d1.floatValue();
        long t4 = d1.longValue();
        short t5 = d1.shortValue();
        byte t6 = d1.byteValue();

        System.out.println("Значение объекта Double 1: " + d1);
        System.out.println("Преобразованное значение из String: " + p);
        System.out.println("Преобразование ко всем примитивным типам:");
        System.out.println("double: " + t1);
        System.out.println("int: " + t2);
        System.out.println("float: " + t3);
        System.out.println("long: " + t4);
        System.out.println("short: " + t5);
        System.out.println("byte: " + t6);

        String d = Double.toString(3.14);
        double p1 = Double.parseDouble(d);
        System.out.println("Литерал типа double в строке: " + p1);
    }
}