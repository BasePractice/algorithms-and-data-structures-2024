package ru.mirea.practice.s23k1167;

public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int year;
    private String group;
    private double gpa; // Средний балл

    public Student(String firstName, String lastName, String major, int year, String group, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.year = year;
        this.group = group;
        this.gpa = gpa;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s, Major: %s, Year: %d, Group: %s, GPA: %.2f",
                firstName, lastName, major, year, group, gpa);
    }
}
