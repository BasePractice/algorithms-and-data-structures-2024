package ru.mirea.practice.s0000001;

public abstract class Main {
    public static void main(String[] args) {
        Exception2 exc = new Exception2();
        exc.exceptionDemo();
        String s1 = "a";
        String s2 = null;
        ThrowsDemo td = new ThrowsDemo();
        td.printDetails(s1);
        td.printDetails(s2);
    }
}
