package ru.mirea.practice.s23k0505.task2;

import java.util.Comparator;

public class MathComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMathGrade() > o2.getMathGrade()) {
            return 1;
        } else if (o1.getMathGrade() < o2.getMathGrade()) {
            return -1;
        } else {
            return 0;
        }
    }
}
