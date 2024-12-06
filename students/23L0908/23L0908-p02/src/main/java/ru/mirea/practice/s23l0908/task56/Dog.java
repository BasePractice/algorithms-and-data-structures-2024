package ru.mirea.practice.s23l0908.task56;

public class Dog {
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog name=" + name + ", age=" + age
            + "\nHuman age=" + getHumanAge();
    }
}

