package ru.mirea.practice.s23k0120.task2;

import java.util.Comparator;

public class PhylosophyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCompSciGrade() > o2.getCompSciGrade()) {
            return 1;
        } else if (o1.getCompSciGrade() < o2.getCompSciGrade()) {
            return -1;
        } else {
            return 0;
        }
    }
}
