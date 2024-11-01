package ru.mirea.practice.s23k0359.studyperson;

public class TheOneWhoSeeksTheKnowledge {
    String name;
    int age;
    float averageMark;

    public TheOneWhoSeeksTheKnowledge(String name, int age, float averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return name + " - тот, кто ищет знания.";
    }

}
