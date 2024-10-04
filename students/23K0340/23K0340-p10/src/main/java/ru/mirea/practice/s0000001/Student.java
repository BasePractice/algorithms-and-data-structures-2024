package ru.mirea.practice.s0000001;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private int av;

    public Student(int av, String name, String surname, String speciality) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.av = av;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAv(int av) {
        this.av = av;
    }

    public int getAv() {
        return av;
    }
}
