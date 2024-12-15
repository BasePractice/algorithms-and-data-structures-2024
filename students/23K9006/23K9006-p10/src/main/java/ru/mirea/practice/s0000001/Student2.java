package ru.mirea.practice.s0000001;

public class Student2 {
    private int idNumber;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student2(int idNumber, String firstName, String lastName, double gpa) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{idNumber="
                + idNumber
                + ", firstName='"
                + firstName
                + '\''
                + ", lastName='"
                + lastName
                + '\''
                + ", gpa="
                + gpa
                + '}';
    }
}
