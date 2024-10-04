package ru.mirea.practice.s23k0093.prac41;

public abstract class Main {
    public static void main(String[] args) {
        // Создание объектов класса Person
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 25);

        // Вызов методов move() и talk() для каждого объекта
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}