package ru.mirea.practice.s23K0135;

import java.util.Comparator;

class Task2 implements Comparator<Pupil> {
    @Override
    public int compare(Pupil p1, Pupil p2) {
        return Double.compare(p2.score, p1.score);
    }

    public static void fastSort(Pupil[] array, int start, int end, Comparator<Pupil> comparator) {
        if (start < end) {
            int pivotIndex = divide(array, start, end, comparator);
            fastSort(array, start, pivotIndex - 1, comparator);
            fastSort(array, pivotIndex + 1, end, comparator);
        }
    }

    private static int divide(Pupil[] array, int start, int end, Comparator<Pupil> comparator) {
        Pupil pivot = array[end];
        int index = start - 1;
        for (int current = start; current < end; current++) {
            if (comparator.compare(array[current], pivot) > 0) {
                index++;
                Pupil temp = array[index];
                array[index] = array[current];
                array[current] = temp;
            }
        }
        Pupil temp = array[index + 1];
        array[index + 1] = array[end];
        array[end] = temp;
        return index + 1;
    }

    public static void main(String[] args) {
        Pupil[] pupils = {
            new Pupil(3, "T", 3.5),
            new Pupil(1, "A", 3.9),
            new Pupil(2, "M", 3.7)
        };

        System.out.println("Before sorting:");
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }

        fastSort(pupils, 0, pupils.length - 1, new Task2());

        System.out.println("\nAfter sorting:");
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
    }
}

