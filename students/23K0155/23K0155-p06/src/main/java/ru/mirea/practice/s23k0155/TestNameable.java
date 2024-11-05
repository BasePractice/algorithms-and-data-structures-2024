package ru.mirea.practice.s23k0155;

public abstract class TestNameable {

    public static void main(String[] args) {
        Nameable earth = new Planet("Земля");
        Nameable tesla = new Man("Иван Иванов");
        Nameable dog = new Animal("Корги");

        System.out.println("Planet: " + earth.getName());
        System.out.println("Man: " + tesla.getName());
        System.out.println("Animal: " + dog.getName());
    }
}

