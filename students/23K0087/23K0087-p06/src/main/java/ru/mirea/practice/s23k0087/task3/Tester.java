package ru.mirea.practice.s23k0087.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Planet planet = new Planet("Нептун");
        Car car = new Car("Audi A6");
        Animal animal = new Animal("Собака");
        
        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}
