package ru.mirea.practice.s23L0908.n5;

public class SchoolStudent extends Pupil {

    public SchoolStudent(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Школьник";
    }
}
