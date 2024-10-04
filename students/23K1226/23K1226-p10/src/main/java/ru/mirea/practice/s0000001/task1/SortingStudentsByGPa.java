package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.Comparator;

class SortingStudentsByGPa {
    private Student[] students;

    public void setArray(Student[] students) {
        this.students = students;
    }

    public void quicksort() {
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getYear(), s1.getYear());
            }
        });
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void mergeStudents(Student[] list1, Student[] list2) {
        Student[] mergedList = Arrays.copyOf(list1, list1.length + list2.length);
        System.arraycopy(list2, 0, mergedList, list1.length, list2.length);
        setArray(mergedList);
        quicksort();
    }
}
