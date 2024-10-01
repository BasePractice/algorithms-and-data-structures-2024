package ru.mirea.practice.s0000001;

public abstract class Fifth {
    public static void main(String[] args) {
        Double i = Double.valueOf(5);
        Double j = Double.valueOf(10);
        String s = "1.1";
        Double d = Double.parseDouble(s);
        Double k = Double.valueOf(d);
        int a = k.intValue();
        byte b = k.byteValue();
        float f = k.floatValue();
        long l = k.longValue();
        short h = k.shortValue();
        System.out.println(i);
        System.out.println(j);
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(l);
        System.out.println(h);
    }
}