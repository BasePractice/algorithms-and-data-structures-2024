package ru.mirea.practices0000001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class MergeSortStudents {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2, Comparator<Student> comparator) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        mergedList.sort(comparator);
        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Alice", "Smith", "CS", 2, "A", 3.8));
        students1.add(new Student("Bob", "Johnson", "Math", 3, "B", 3.5));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Charlie", "Brown", "Physics", 1, "C", 4.0));
        students2.add(new Student("David", "Davis", "Chemistry", 4, "D", 3.2));

        List<Student> mergedList = mergeSort(students1, students2, Comparator.comparingDouble(Student::getGpa).reversed());

        System.out.println("Merged and sorted by GPA:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}