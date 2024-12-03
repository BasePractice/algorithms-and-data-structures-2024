package ru.mirea.practice.s0000001.n5;

public class SchoolStudent extends Pupil {

    public SchoolStudent(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Школьник";
    }
}