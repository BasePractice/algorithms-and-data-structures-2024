package ru.mirea.practice.s23f0011;

public abstract class Obolochka {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14);
        Double secondval2 = Double.valueOf("2.71828");
        String str = "1.61803";
        double thirDouble3 = Double.parseDouble(str);
        double fourDouble4 = d1.doubleValue();
        float fiftFloat5 = d1.floatValue();
        long sixtLong6 = d1.longValue();
        int seveInt7 = d1.intValue();
        short eightShort8 = d1.shortValue();
        byte nineByte9 = d1.byteValue();
        System.out.println(secondval2);
        System.out.println(thirDouble3);
        System.out.println(fourDouble4);
        System.out.println(fiftFloat5);
        System.out.println(sixtLong6);
        System.out.println(seveInt7);
        System.out.println(eightShort8);
        System.out.println(nineByte9);
        System.out.println("Значение d1: " + d1);
        String dString = Double.toString(3.14);
        System.out.println("Значение dString: " + dString);
    }
}
