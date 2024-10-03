package ru.mirea.practice.s23k0093;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa {
    private List<Student> students;

    public SortingStudentsByGpa() {
        students = new ArrayList<>();
    }

    public void setArray(Student[] studentArray) {
        for (Student student : studentArray) {
            students.add(student);
        }
    }

    public void quickSort() {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public void mergeSort() {
        if (students.size() > 1) {
            int mid = students.size() / 2;
            List<Student> left = new ArrayList<>(students.subList(0, mid));
            List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

            SortingStudentsByGpa leftSorter = new SortingStudentsByGpa();
            leftSorter.setArray(left.toArray(new Student[0]));
            leftSorter.mergeSort();

            SortingStudentsByGpa rightSorter = new SortingStudentsByGpa();
            rightSorter.setArray(right.toArray(new Student[0]));
            rightSorter.mergeSort();

            merge(leftSorter.getStudents(), rightSorter.getStudents());
        }
    }

    private void merge(List<Student> left, List<Student> right) {
        students.clear();
        int i = 0;
        int j = 0;
        
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() >= right.get(j).getGpa()) {
                students.add(left.get(i));
                i++;
            } else {
                students.add(right.get(j));
                j++;
            }
        }
        
        while (i < left.size()) {
            students.add(left.get(i));
            i++;
        }
        
        while (j < right.size()) {
            students.add(right.get(j));
            j++;
        }
    }

    public void outArray() {
        for (Student student : students) {
            
            System.out.println(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        SortingStudentsByGpa sortingStudents = new SortingStudentsByGpa();

        Student[] studentArray = {
            new Student("Иван", "Иванов", "Программист", 2, "CS-201", 3.8),
            new Student("Пётр", "Петров", "Математик", 3, "Math-301", 3.6),
            new Student("Дарья", "Дуброва", "Физик", 1, "Phys-101", 3.9),
            new Student("Анна", "Купцова", "Инженер", 2, "Eng-201", 3.5)
        };

        sortingStudents.setArray(studentArray);

        System.out.println("Сортировка по GPA методом QuickSort:");
        sortingStudents.quickSort();
        sortingStudents.outArray();

        System.out.println("\nСортировка по GPA методом слияния:");
        sortingStudents.mergeSort();
        sortingStudents.outArray();
    }
}
