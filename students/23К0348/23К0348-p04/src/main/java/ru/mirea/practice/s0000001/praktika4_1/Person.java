package ru.mirea.practice.s0000001.praktika4_1;

class Person {
    private String fullName;
    private int age;

    public Person() {
        this("Unknown", 0);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " движется.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John Doe", 30);

        person1.talk();
        person2.talk();
    }
}
