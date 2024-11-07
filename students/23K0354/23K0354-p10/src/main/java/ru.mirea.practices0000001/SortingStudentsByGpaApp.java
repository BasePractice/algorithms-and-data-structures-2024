package ru.mirea.practices0000001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortingStudentsByGpaApp extends SortingStudentsByGpa {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Smith", "CS", 2, "A", 3.8));
        students.add(new Student("Bob", "Johnson", "Math", 3, "B", 3.5));
        students.add(new Student("Charlie", "Brown", "Physics", 1, "C", 4.0));
        students.add(new Student("David", "Davis", "Chemistry", 4, "D", 3.2));

        SortingStudentsByGpaApp sorter = new SortingStudentsByGpaApp();

        sorter.setArray(students);
        System.out.println("Before sorting:");
        sorter.outArray();

        sorter.quickSort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("\nAfter quick sort by GPA:");
        sorter.outArray();

        sorter.mergeSort(Comparator.comparing(Student::getLastName));
        System.out.println("\nAfter merge sort by last name:");
        sorter.outArray();
    }
}