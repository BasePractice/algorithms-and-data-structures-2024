package ru.mirea.practice.s23L0908.prog4;

public abstract class Main {
    public static void main(String[] args) {
        MathFunc func1 = new MathFunc(5.0);
        System.out.println(func1.abscomplex(func1.radius, 2));

        System.out.println(func1.sircleLenght());

        func1.setRadius(10.0);
        System.out.println(func1.powering(func1.radius, 2));
        System.out.println(func1.toString());
    }
}
