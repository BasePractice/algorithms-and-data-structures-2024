package ru.mirea.practice.s0000001;

public final class Task1 {

    private Task1() {
    }

    public static void main(String[] args) {
        Pupil[] pupils = {
            new Pupil(3, "М", 0),
            new Pupil(1, "С", 0),
            new Pupil(2, "П", 0)
        };

        System.out.println("Before sorting:");
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }

        XSort.sort(pupils);

        System.out.println("\nAfter sorting:");
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
    }
}
