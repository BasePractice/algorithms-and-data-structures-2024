package ru.mirea.practice.s0000001;

public class Dog {
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int convertToHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" + "Name:" + name + ", Age:" + age + ", Human age:" + convertToHumanAge() + '\n';
    }
}


