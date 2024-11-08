package ru.mirea.practice.s27k0112;

import java.util.Comparator;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        SortingStudentsByGpa sorter = new SortingStudentsByGpa();

        Student[] studentsArray = new Student[]{new Student("Alice","Physics", 2,"KV1",
                3.5), new Student("Bob","Mathematics", 3,"KV2", 4.7), new Student("Rain",
                "Biology", 1,"KV0", 3.9), new Student("Fon","Computer Science", 4,
                "KV10", 4.9)};

        sorter.setArray(studentsArray);

        Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa).reversed();

        sorter.quicksort(gpaComparator);

        System.out.println("Sorted by GPA using Quick Sort:");
        sorter.outArray();

        sorter.setArray(studentsArray);

        sorter.mergeSort(gpaComparator);

        System.out.println("\nSorted by GPA using Merge Sort:");
        sorter.outArray();

    }
}

