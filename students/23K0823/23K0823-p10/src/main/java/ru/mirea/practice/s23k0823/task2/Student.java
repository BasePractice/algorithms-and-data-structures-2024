package ru.mirea.practice.s23k0823.task2;

//public class Student {
//    private String name;
//    private String surname;
//    private String specialty;
//    private int course;
//    private String roup;
//    private double gpa;
//
//    public Student(String name, String surname, String specialty, int course, String group, double gpa) {
//        this.name = name;
//        this.surname = surname;
//        this.specialty = specialty;
//        this.course = course;
//        this.group = group;
//        this.gpa = gpa;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getSpecialty() {
//        return specialty;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public double getGPA() {
//        return gpa;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", specialty='" + specialty + '\'' +
//                ", course=" + course +
//                ", group=" + group +
//                ", gpa=" + gpa +
//                '}';
//    }
//}

public class Student {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double gpa;

    public Student(String name, String surname, String specialty, int course, String group, double gpa) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
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
}



