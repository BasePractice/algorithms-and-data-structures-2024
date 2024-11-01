package ru.mirea.practice.s230k754.lab4p1.task3;

public class Person {
    private String fullname;
    private int age;

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Person() {
        this.fullname = "None";
    }

    public void move() {
        System.out.printf("%s говорит", this.fullname);
    }

    public void talk() {
        System.out.printf("%s говорит", this.fullname);
    }

    public int getAge() {
        return age;
    }
}
