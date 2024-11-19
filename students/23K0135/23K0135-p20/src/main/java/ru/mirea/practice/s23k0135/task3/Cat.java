package ru.mirea.practice.s23k0135.task3;

public class Cat extends Animal {

    public Cat(int weight, String name) {
        super(name, weight);
    }

    public void meow() {
        System.out.println(getName() + " is meowing");
    }
}
