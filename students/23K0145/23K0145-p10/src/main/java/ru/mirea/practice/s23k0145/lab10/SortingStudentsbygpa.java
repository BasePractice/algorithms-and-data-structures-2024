package ru.mirea.practice.s23k0145.lab10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsbygpa {

    private List<Student> studentList;

    // Конструктор
    public SortingStudentsbygpa() {
        this.studentList = new ArrayList<>();
    }

    // Метод для заполнения массива студентов
    public void setArray() {
        studentList.add(new Student("Alice", "Johnson", "Computer Science", 2, "KVBO-01-23", 3.8));
        studentList.add(new Student("Bob", "Smith", "Mathematics", 1, "KVBO-01-24", 3.6));
        studentList.add(new Student("Charlie", "Brown", "Physics", 3, "KVBO-02-23", 3.9));
        studentList.add(new Student("David", "Davis", "Chemistry", 2, "KVBO-02-24", 3.7));
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // Метод для сортировки по среднему баллу (быстрая сортировка)
    public void quickSort() {
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });
    }

    // Метод для сортировки по специальности (слияние)
    public void mergeSortBySpecialty() {
        studentList = mergeSort(studentList);
    }

    private List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }
        int mid = students.size() / 2;
        List<Student> left = mergeSort(students.subList(0, mid));
        List<Student> right = mergeSort(students.subList(mid, students.size()));
        return merge(left, right);
    }

    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getSpecialty().compareTo(right.get(j).getSpecialty()) < 0) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));
        return result;
    }

    public static void main(String[] args) {
        SortingStudentsbygpa sortingStudents = new SortingStudentsbygpa();
        sortingStudents.setArray();

        System.out.println("Студенты до сортировки по GPA:");
        sortingStudents.outArray();

        sortingStudents.quickSort();
        System.out.println("\nСтуденты после сортировки по GPA (по убыванию):");
        sortingStudents.outArray();

        sortingStudents.mergeSortBySpecialty();
        System.out.println("\nСтуденты после сортировки по специальности:");
        sortingStudents.outArray();
    }
}

