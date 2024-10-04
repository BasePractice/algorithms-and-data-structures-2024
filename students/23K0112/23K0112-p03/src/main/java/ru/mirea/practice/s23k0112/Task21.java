package ru.mirea.practice.s23k0112;

public final class Task21 {
    private Task21() {

    }

    public static void main(String[] args) {
        String str = "3.14";
        Double obj = Double.valueOf(str);

        double num = Double.parseDouble(str);
        System.out.println(num);

        double primitiveDouble = obj.doubleValue();
        float primitiveFloat = obj.floatValue();
        long primitiveLong = obj.longValue();
        int primitiveInt = obj.intValue();

        System.out.printf("%f %f %f %d%n %d", obj, primitiveDouble, primitiveFloat, primitiveLong, primitiveInt);
    }
}