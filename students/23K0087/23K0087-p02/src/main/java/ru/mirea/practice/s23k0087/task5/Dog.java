package ru.mirea.practice.s23k0087.task5;

public class Dog {
    private final String name;
    private final float age;

    public Dog(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public float getAge() { return age; }

    public String getName() {
        return name;
    }

    public float toHumanAge() {
        return age * 7;
    }

    public String toString() {
        return "Dog[name = " + name + ", age = " + age + "]";
    }
}
