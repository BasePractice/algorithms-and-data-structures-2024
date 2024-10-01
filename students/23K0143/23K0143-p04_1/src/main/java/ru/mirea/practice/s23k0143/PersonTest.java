package ru.mirea.practice.s23k0143;

public abstract class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("Леонид Каневский", 85);
        person2.move();
        person2.talk();
    }
}
