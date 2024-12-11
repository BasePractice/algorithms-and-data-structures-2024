package ru.mirea.practice.s230k754.lab10;

public class Student {
    private String name;
    private String surname;
    private String spetial;
    private int course;
    private String groupe;
    private int estimation; // оценка

    public Student(String name, String surname, String spetial, int course, String groupe, int estimation) {
        this.name = name;
        this.surname = surname;
        this.spetial = spetial;
        this.course = course;
        this.groupe = groupe;
        this.estimation = estimation;
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

    public String getSpetial() {
        return spetial;
    }

    public void setSpetial(String spetial) {
        this.spetial = spetial;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Surname: " + surname + " Spetial: " + spetial
                + " cource: " + course + " groupe: " + groupe + " estimation: " + estimation;
    }
}
