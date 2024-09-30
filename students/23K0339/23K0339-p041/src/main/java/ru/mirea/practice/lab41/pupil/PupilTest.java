package ru.mirea.practice.lab41.pupil;

public abstract class PupilTest {
    public static void main(String[] args) {
        Pupil[] pupils = new Pupil[6];

        pupils[0] = new Schoolchild("Пафнутий");
        pupils[1] = new Student("Марина");
        pupils[2] = new Schoolchild("Анатолий");
        pupils[3] = new Student("Ирада");
        pupils[4] = new Schoolchild("Евгений");
        pupils[5] = new Student("Ольга");

        System.out.println("Студенты:");
        for (Pupil pupil : pupils) {
            if (pupil instanceof Student) {
                pupil.displayInfo();
            }
        }

        System.out.println("\nШкольники:");
        for (Pupil pupil : pupils) {
            if (pupil instanceof Schoolchild) {
                pupil.displayInfo();
            }
        }
    }
}

