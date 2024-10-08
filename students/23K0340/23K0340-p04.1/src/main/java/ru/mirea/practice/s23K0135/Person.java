package ru.mirea.practice.s23K0135;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "";
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
        System.out.println(this.fullName + " идет");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }
}
