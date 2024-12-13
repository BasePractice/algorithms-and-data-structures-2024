package ru.mirea.practice.s0000001.num2;

public class Student extends Uchashchiesya {
    Student(String name) {
        super(name);
    }

    @Override
    void show() {
        System.out.println("Студент: " + name);
    }
}
