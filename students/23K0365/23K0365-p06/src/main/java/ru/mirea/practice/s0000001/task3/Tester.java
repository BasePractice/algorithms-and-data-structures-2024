package ru.mirea.practice.s0000001.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Planet a = new Planet(99, "Jupiter", 99999);
        Animals b = new Animals(1, "Lion");
        System.out.println(a.getName() + ", " + b.getName());
    }
}
