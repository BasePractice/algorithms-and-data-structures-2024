package ru.mirea.practice.s23k0087.task5;

public abstract class Tester {
    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber("+119119923436");
        System.out.println(phoneNumber1.formatNumber());
        PhoneNumber phoneNumber2 = new PhoneNumber("88005553535");
        System.out.println(phoneNumber2.formatNumber());
    }
}
