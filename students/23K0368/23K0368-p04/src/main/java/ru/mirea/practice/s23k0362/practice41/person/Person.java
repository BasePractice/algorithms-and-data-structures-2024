package ru.mirea.practice.s23k0362.practice41.person;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    public void mov() {
        System.out.println("Такой-то " + fullName + " перемещается");
    }

    public void talk() {
        System.out.println("Такой-то " + fullName + " говорит");
    }

}
