package ru.mirea.practice.s0000001;

public class Person {

    private String firstName;
    private String lastName;
    private String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        if (firstName == null || firstName.isEmpty()) {
            return lastName;
        } else if (patronymic == null || patronymic.isEmpty()) {
            return lastName + " " + firstName.charAt(0) + ".";
        } else {
            return lastName + " " + firstName.charAt(0) + ". " + patronymic.charAt(0) + ".";
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иван", "Иванов", "Иванович");
        Person person2 = new Person("Иван", "Иванов", null);
        Person person3 = new Person("Иван", null, null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}

