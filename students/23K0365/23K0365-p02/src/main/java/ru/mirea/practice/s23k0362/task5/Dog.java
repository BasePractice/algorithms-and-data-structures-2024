package ru.mirea.practice.s23k0362.task5;

public class Dog {
    private String name;
    private String owner;
    private int years;

    public Dog(String name, String owner, int years) {
        this.name = name;
        this.owner = owner;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public int dogToHuman() {
        return this.years * 7;
    }

    @Override
    public String toString() {
        return "Dod's name is " + name
                + " and it's owner is " + owner
                + ". This dog is " + years
                + " years old!!!!)";
    }
}
