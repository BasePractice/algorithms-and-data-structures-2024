package ru.mirea.practice.s23k0130.task2;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        Person person1 = new Person("Еров", "Антон", "Владимирович");
        Person person2 = new Person("Храмченков", null, "Владимирович");
        Person person3 = new Person("Носов", "Данила", null);
        Person person4 = new Person("Васильев", null, null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}
