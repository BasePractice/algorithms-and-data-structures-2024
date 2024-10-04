package ru.mirea.practice.s23k0359.studyperson;

public class Student extends TheOneWhoSeeksTheKnowledge {
    public String group;
    public int failedtests;

    public Student(String name, int age, float averageMark, String group, int failedtests) {
        super(name, age, averageMark);
        this.group = group;
        this.failedtests = failedtests;
    }

    @Override
    public String toString() {
        return name + " - студент.";
    }
}
