package ru.mirea.practice.s230k754.lab3.taskclassvlan.task3;

public final class Task3 {
    private Task3() {}

    public static void main(String[] args) {
        Double d1 = Double.valueOf("2.0");
        String s1 = String.valueOf(d1);
        int i1 = d1.intValue();
        short sh1 = d1.shortValue();
        float f1 = d1.floatValue();
        byte b1 = d1.byteValue();

        System.out.printf("%f, %s, %d, %d, %f, %d", d1, s1, i1, sh1, f1, b1);
    }
}
