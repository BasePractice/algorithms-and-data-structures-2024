package ru.mirea.practice.s0000002.practice41.person;

public abstract class Main {
    public static void main(String[] args) {
        //Создание класса без аргументов
        Person person = new Person();
        person.fullName = "Иван";
        person.age = 19;
        person.talk();
        person.mov();

        //Создание класса с использованием аргументов
        Person person1 = new Person("Andrey", 19);
        person1.talk();
        person1.mov();
    }
}
