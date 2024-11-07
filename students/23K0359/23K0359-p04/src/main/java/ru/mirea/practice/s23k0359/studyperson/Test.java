package ru.mirea.practice.s23k0359.studyperson;

public abstract class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Райна Гослинг", 18, 4, "КАБО-01-11", 0);
        Pupil pupil1 = new Pupil("Рар Ослик", 13, 5, "8Б");

        TheOneWhoSeeksTheKnowledge[] seekers;
        seekers = new TheOneWhoSeeksTheKnowledge[] {student1, pupil1};
        for (TheOneWhoSeeksTheKnowledge seeker : seekers) {
            System.out.println(seeker);
        }
    }
}
