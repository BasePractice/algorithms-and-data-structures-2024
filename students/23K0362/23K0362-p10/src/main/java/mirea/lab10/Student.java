package mirea.lab9;

public class Student {
    String firstName;
    String surname;
    String specialization;
    int course;
    String nameGroup;
    double gpa;

    public Student(String firstName, String surname, String specialization, int course, String nameGroup, double gpa) {
        this.firstName = firstName;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.nameGroup = nameGroup;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
}
