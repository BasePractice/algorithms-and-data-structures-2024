package ru.mirea.practice.s23k0359.studyperson.task3;

public abstract class Test {
    public static void main(String[] args) {
        Planets planet1 = new Planets("Earth");
        Planets planet2 = new Planets("Moon");
        Machines machine1 = new Machines("Tank");
        Machines machine2 = new Machines("Car");
        Animals animal1 = new Animals("Kangaroo");
        Animals animal2 = new Animals("Panda");

        System.out.println(planet1.getName());
        System.out.println(planet2.getName());
        System.out.println(machine1.getName());
        System.out.println(machine2.getName());
        System.out.println(animal1.getName());
        System.out.println(animal2.getName());
    }
}
