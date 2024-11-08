package ru.mirea.practice.s23k0215.task2;



public abstract class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Пупкин", "Василий", "Иванович");
        Person person2 = new Person("Матанов", "Петруха", null);
        Person person3 = new Person("Шариков", null, null);

        PersonFormatter formatter = new PersonFormatter();

        System.out.println(formatter.getFullNameInitials(person1));
        System.out.println(formatter.getFullNameInitials(person2));
        System.out.println(formatter.getFullNameInitials(person3));
    }
}
