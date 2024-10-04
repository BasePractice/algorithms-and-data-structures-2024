package ru.mirea.practice.s23k0623;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String speciality;
    private int course;
    private String group;
    private double gpa;

    public Student(String id, String firstName, String lastName, String speciality, int course, String group, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{ " + "id:" + id + ", firstName=" + firstName + ", lastName="
            + lastName + ", speciality=" + speciality + ", course=" + course
            + ", group=" + group + ", gpa=" + gpa + " }";
    }
}
