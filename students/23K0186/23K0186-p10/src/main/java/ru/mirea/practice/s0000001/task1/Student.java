package ru.mirea.practice.s0000001.task1;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private String year;
    private String group;

    Student(String name,String surname,String specialization,String year,String group) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.year = year;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getYear() {
        return year;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
