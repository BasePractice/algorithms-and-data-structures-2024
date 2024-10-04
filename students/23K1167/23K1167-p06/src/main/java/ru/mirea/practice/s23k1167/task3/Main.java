package ru.mirea.practice.s23k1167.task3;


public abstract class Main {
    public static void main(String[] args) {
        Planet planet = new Planet("Земля");
        Car car = new Car("Toyota");
        Animal animal = new Animal("Собака");

        System.out.println(planet.getName());
        System.out.println(car.getName());
        System.out.println(animal.getName());
    }
}