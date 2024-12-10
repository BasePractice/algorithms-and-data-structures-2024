package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        ConcreteFactory cf = new ConcreteFactory();
        cf.setReal(10);
        cf.setImage(20);
        Complex c = cf.createcomplex();
        c.setImage(10);
        c.setReal(10);
        System.out.println(c.getImage());
    }
}
