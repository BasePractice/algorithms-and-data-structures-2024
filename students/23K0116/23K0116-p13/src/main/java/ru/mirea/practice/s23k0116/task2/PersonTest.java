package ru.mirea.practice.s23k0116.task2;

public abstract class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр", null);
        Person person3 = new Person("Кузнецова", null, null);
        //Person person6 = new Person(null, "", null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        //System.out.println(person6.getFullName());

    }
}
