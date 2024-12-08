package ru.mirea.practice.s23k0368;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name + " age=" + age;

    }

    public int age() {
        return age;
    }
}
