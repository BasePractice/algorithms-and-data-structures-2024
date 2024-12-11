package ru.mirea.practice.s23k0359.studyperson;

public class Pupil extends TheOneWhoSeeksTheKnowledge {
    public String grade;

    public Pupil(String name, int age, float averageMark, String grade) {
        super(name, age, averageMark);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " - школьник.";
    }
}
