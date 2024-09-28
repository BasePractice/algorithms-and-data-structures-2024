package ru.mirea.practice.s23k0112;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name; // Changed method name for consistency
    }

    public int getAge() {
        return age; // Changed method name for consistency
    }

    public void setAge(int newAge) { // Changed parameter name for clarity
        this.age = newAge;
    }

    public int convertToHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return String.format("Dog's card:%nName: %s%nAge: %d%nAge in human: %d",
                name, age, convertToHumanAge());
    }
}