package ru.mirea.practice.s23k0155.task3;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.print("Enter dog's name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeInHumans() {
        return age * 7;
    }

    public void setInf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog's name:" + name
                + "\nDog's age: " + age + " = " + age * 7;
    }
}
