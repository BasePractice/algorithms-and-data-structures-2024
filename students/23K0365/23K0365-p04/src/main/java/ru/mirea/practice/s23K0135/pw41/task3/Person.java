package ru.mirea.practice.s23K0135.pw41.task3;

public class Person {
    private String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        //
    }

    public void move() {
        if (fullName != null) {
            System.out.println(fullName + " is moving");
        }
    }

    public void talk() {
        if (fullName != null) {
            System.out.println(fullName + " is talking");
        }
    }
}
