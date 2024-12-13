package ru.mirea.practice.s23l0908;

public class Person {
    private final String firstname;
    private final String middlename;
    private final String lastname;

    public Person(String firstname, String middlename, String lastname) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
    }

    public Person(String firstname) {
        this(firstname, "Xuan", "Phong");
    }

    public static void main(String[] args) {
        Person person = new Person("Hoang");
        System.out.println(person.getName());
    }

    public String getName() {
        return firstname + " " + middlename + " " + lastname;
    }
}
