package ru.mirea.practice.s23k0120.task5.dog;

public class Dog {
    private String name;
    private float age;

    public Dog(String name, float age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public float getAgeToHuman() {
        return age * 7f;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Собака: " + "Кличка='" + name + '\'' + ", возраст=" + age;
    }
}
