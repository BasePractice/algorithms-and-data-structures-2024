package ru.mirea.practice.s23K0135.task1;

public abstract class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Mars");
        Nameable car = new Car("Tesla Model S");
        Nameable animal = new Animal("Tiger");

        System.out.println("Planet name: " + planet.getName());
        System.out.println("Car name: " + car.getName());
        System.out.println("Animal name: " + animal.getName());
    }
}

