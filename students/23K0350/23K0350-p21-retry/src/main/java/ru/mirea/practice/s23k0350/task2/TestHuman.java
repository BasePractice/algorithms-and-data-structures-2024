package ru.mirea.practice.s23k0350.task2;

public class TestHuman {
    String name;
    int age;

    public TestHuman(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Age:" + age;
    }
}
