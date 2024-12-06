package ru.mirea.practice.s23l0908;


public class Student {

    private final String firstname;
    private final String lastname;
    private final String speciality;
    private final int course;
    private final String group;
    private final int gpa;

    public Student(String firstname, String lastname, String speciality, int course, String group, int gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public int getgpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{ "
            + "First name :"
            + firstname
            + ", Last name: "
            + lastname
            + ", Speciality: "
            + speciality
            + ", Course: "
            + course
            + ", Group: "
            + group
            + ", GPA = "
            + gpa
            + "}";
    }
}
