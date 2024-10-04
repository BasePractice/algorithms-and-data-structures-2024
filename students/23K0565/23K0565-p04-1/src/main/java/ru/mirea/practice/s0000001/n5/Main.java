package ru.mirea.practice.s0000001.n5;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[4];
        pupils[0] = new SchoolStudent("Андрей");
        pupils[1] = new UniversityStudent("Мария");
        pupils[2] = new SchoolStudent("Сергей");
        pupils[3] = new UniversityStudent("Анна");

        System.out.println("Школьники:");
        for (Pupil pupil : pupils) {
            if (pupil instanceof SchoolStudent) {
                System.out.println(pupil);
            }
        }

        System.out.println("\nСтуденты:");
        for (Pupil pupil : pupils) {
            if (pupil instanceof UniversityStudent) {
                System.out.println(pupil);
            }
        }
    }
}