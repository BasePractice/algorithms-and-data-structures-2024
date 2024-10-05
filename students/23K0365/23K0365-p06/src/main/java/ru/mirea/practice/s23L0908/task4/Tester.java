package ru.mirea.practice.s23L0908.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Car a = new Car(999, "Bently");
        Comps b = new Comps(99, "LG-831289bhjbvvjkwbbkwek");
        System.out.println(a.getPrice() + ", " + b.getPrice());
    }
}
