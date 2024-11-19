package ru.mirea.practice.s0000001.task1;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (middleName == null || middleName.isEmpty()) {
            return lastName + " " + firstName.charAt(0) + ".";
        }
        return lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".";
    }
}
