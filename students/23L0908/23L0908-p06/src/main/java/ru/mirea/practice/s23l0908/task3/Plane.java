package ru.mirea.practice.s23l0908.task3;

public class Plane implements Nameable {
    private final String name;

    Plane(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("This plane is : " + this.name);
    }
}
