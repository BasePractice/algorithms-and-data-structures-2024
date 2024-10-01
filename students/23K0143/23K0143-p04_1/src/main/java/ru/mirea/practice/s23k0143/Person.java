package ru.mirea.practice.s23k0143;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Такой-то";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println(fullName + " двигается.");
    }

    public void talk() {
        System.out.println(fullName + " разговаривает.");
    }
}