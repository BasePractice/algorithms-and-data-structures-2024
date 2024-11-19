package ru.mirea.practice.s0000001.task2;

public class Student implements LabClass {
    private String firstName;
    private String secondName;
    private String speciality;
    private int course;
    private String group;
    private int gpa;

    public Student(String firstName, String secondName, String speciality,
                   int course, String group, int gpa) throws EmptyStringException {
        this.firstName = firstName;
        this.secondName = secondName;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        if (secondName.isEmpty() || firstName.isEmpty()) {
            throw new EmptyStringException("ERORR: " + "not completed name");
        }
    }

    @Override
    public String toString() {
        return "Student:\n"
            + "firstName - " + firstName
            + ", secondName - " + secondName
            + ", speciality - " + speciality
            + ", course: " + course
            + ", group: " + group
            + ", gpa = " + gpa;
    }

    public int getGPa() {
        return gpa;
    }

    public void setGPa(int gpa) {
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
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

    @Override
    public boolean compareStudents(Student a) {
        return getGPa() - a.getGPa() > 0;
    }
}
