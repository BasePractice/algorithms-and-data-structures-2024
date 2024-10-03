package ru.mirea.practice.s0000001.task4;

public abstract class Test {
    public static void main(String[] args) {
        Pricable s = new Salt(1.0);
        Pricable c = new Cinnamon(2.0);
        Pricable p = new Pepper(3.0);
        System.out.println("The price of Salt s :" + s.getPrice());
        System.out.println("The price of Cinnamon c :" + c.getPrice());
        System.out.println("The price of Pepper p :" + p.getPrice());
    }
}
