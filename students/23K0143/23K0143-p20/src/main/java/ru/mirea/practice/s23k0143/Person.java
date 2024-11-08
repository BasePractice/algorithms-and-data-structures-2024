package ru.mirea.practice.s23k0143;

import java.io.Serializable;

public class Person extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;

    public Person(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
