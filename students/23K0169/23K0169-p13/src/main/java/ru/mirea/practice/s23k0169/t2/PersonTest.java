package ru.mirea.practice.s23k0169.t2;

public final class PersonTest {

    private PersonTest() {

    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр", null);
        Person person3 = new Person("Сидорова", null, null);
        Person person4 = new Person("Кузнецов", "Алексей", "");

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());

        System.out.println(person1);
    }
}
