package ru.mirea.practice.s23k0505.task2;


public abstract class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Александр", "Пушкин", "Сергеевич");
        Person person2 = new Person("Есенин");
        System.out.println(person1);
        System.out.println(person2);
    }
}
