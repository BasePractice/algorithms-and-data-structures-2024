package ru.mirea.practice.lab13;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getInitials() {
        String initials = lastName;
        if (firstName != null && !firstName.isEmpty()) {
            initials += " " + firstName.charAt(0) + ".";
        }
        if (middleName != null && !middleName.isEmpty()) {
            initials += middleName.charAt(0) + ".";
        }
        return initials;
    }

    public static void main(String[] args) {
        Person person = new Person("Карпов", "Дмитрий", "Анатольевич");
        System.out.println(person.getInitials());

        Person personWithoutMiddleName = new Person("Зорина", "Наталья", null);
        System.out.println(personWithoutMiddleName.getInitials());

        Person personWithoutFirstAndMiddleName = new Person("Петрусевич", null, null);
        System.out.println(personWithoutFirstAndMiddleName.getInitials());
    }
}

