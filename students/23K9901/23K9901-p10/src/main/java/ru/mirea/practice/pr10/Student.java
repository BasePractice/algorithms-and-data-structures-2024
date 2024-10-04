package ru.mirea.practice.pr10;

public class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;

    public Student(String firstName, String lastName, String major, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{"
                + "firstName='"
                + firstName
                + '\''
                + ", lastName='"
                + lastName
                + '\''
                + ", major='"
                + major
                + '\''
                + ", course="
                + course
                + ", group='"
                + group
                + '\''
                + '}';
    }
}
