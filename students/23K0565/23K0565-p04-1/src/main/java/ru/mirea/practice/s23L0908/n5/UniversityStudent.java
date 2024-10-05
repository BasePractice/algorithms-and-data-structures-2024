package ru.mirea.practice.s23L0908.n5;

public class UniversityStudent extends Pupil {

    public UniversityStudent(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Студент";
    }
}
