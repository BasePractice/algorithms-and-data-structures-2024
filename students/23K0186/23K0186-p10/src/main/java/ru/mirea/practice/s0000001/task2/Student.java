package ru.mirea.practice.s0000001.task2;

public class Student  {
    private int gpa;
    private int id;

    Student(int gpa, int id) {
        this.gpa = gpa;
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public int getId() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int compareTo(Student s,int num) {
        if (num == 1) {
            return this.getGpa() - s.getGpa();
        } else  {
            return this.getId() - s.getId();
        }
    }

    @Override
    public String toString() {
        return "Student{GPA=" + gpa + ",id=" + id + "}";
    }

}
