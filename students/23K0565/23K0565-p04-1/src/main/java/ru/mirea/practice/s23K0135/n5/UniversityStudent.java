package ru.mirea.practice.s23K0135.n5;

public class UniversityStudent extends Pupil {

    public UniversityStudent(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Студент";
    }
}
