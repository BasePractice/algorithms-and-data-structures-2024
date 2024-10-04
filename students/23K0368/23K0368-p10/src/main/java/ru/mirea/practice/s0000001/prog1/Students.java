package ru.mirea.practice.s0000001.prog1;

public class Students {
    public String name;
    public String surname;
    public String specialization;
    public int course;
    public String group;

    public Students(String name, String surname, String specialization, int course, String group) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{"
                + "name='" + name + '\''
                + ", surname=" + surname
                + ", specialization='" + specialization + '\''
                + ", course=" + course
                + ", group='" + group + '\''
                + '}';
    }
}
