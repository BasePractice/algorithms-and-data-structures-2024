package ru.mirea.practice.s0000002;

public abstract class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("name",19);
        person2.move();
        person2.talk();
        person1.talk();
    }
}