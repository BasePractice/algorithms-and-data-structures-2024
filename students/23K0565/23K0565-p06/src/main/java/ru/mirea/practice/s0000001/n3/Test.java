package ru.mirea.practice.s0000001.n1;

import ru.mirea.practice.s0000001.n3.Animal;
import ru.mirea.practice.s0000001.n3.Car;
import ru.mirea.practice.s0000001.n3.Nameable;
import ru.mirea.practice.s0000001.n3.Planet;

public abstract class Test {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("Tesla");
        Nameable animal = new Animal("Lion");

        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}