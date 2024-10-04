package ru.mirea.practice.s0000001.task3;

public abstract class Test {
    public static void main(String[] args) {
        Planet earth = new Planet("Земля");
        Car car = new Car("BMW");
        Animal cat = new Animal("Кошка");

        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + car.getName());
        System.out.println("Animal name: " + cat.getName());
    }
}
