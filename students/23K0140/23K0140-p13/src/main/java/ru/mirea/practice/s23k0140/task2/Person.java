package ru.mirea.practice.s23k0140.task2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;


    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }


    public String getFullName() {
        StringBuilder fullName = new StringBuilder(lastName);
        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ").append(firstName.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            fullName.append(" ").append(middleName.charAt(0)).append(".");
        }

        return fullName.toString();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

}