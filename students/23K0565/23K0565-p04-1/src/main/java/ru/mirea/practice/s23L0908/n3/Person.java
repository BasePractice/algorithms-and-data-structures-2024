package ru.mirea.practice.s23L0908.n3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        // 123
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " двигается");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    @Override
    public String toString() {
        return "Имя: " + fullName + ", Возраст: " + age;
    }
}