package ru.mirea.practice.s23k0505.task3;

public abstract class Main {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Mars");
        God god1 = new God("Mars");
        Planet planet2 = new Planet("Venus");
        God god2 = new God("Venus");
        Person person = new Person("Ivan");
        Pet pet = new Pet("Freddy");

        Nameable[] nameables = {planet1, god1, planet2, god2, person, pet};

        for (Nameable nameable : nameables) {
            System.out.println(nameable.getName());
        }
    }
}
