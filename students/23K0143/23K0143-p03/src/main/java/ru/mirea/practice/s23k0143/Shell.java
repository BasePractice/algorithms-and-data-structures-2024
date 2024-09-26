package ru.mirea.practice.s23k0143;

public abstract class Shell {
    public static void main(String[] args) {
        //1
        Double dX1 = Double.valueOf(3.14);
        Double dX2 = Double.valueOf("3.14");
        //2
        String strX = "3.14";
        double prD = Double.parseDouble(strX);
        //3
        Double doubleX = 3.14;
        double pD = doubleX.doubleValue();
        float pF = doubleX.floatValue();
        long pL = doubleX.longValue();
        int pI = doubleX.intValue();
        //4
        System.out.println("Объект Double: " + doubleX);
        //5
        String d = Double.toString(3.14);
        System.out.println("Строковое представление: " + d);

        //Вывод всех
        System.out.println(dX1 + " " + dX2 + " " + prD + " " + pD + " " + pF + " " + pL + " " + pI);
    }
}
