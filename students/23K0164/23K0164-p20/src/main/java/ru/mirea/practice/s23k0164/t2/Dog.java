package ru.mirea.practice.s23k0164.t2;

public class Dog extends Animal {

    public Dog(int weight, String name) {
        super(name, weight);
    }

    public void bark() {
        System.out.println(getName() + " is barking!");
    }
}
