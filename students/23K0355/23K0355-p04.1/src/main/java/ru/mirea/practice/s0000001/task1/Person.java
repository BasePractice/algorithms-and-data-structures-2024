package ru.mirea.practice.s0000001.task1;

public class Person {

    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Кто-то";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " двигается.");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Создание объектов класса Person
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 30);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

        System.out.println(person2.getFullName() + " - " + person2.getAge() + " лет.");
    }

    public String getFullName() {
        return fullName;
    }
}