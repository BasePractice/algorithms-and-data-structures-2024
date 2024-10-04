package ru.mirea.practice.s0000001.task1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA sorting = new SortingStudentsByGPA();
        sorting.setArray();
        sorting.quicksort();
        System.out.println("Отсортированные студенты по GPA:");
        sorting.outArray();

        List<Student> otherStudents = new ArrayList<>();
        otherStudents.add(new Student("David", "Wilson", "Biology", 2, "BIO-202", 3.6));
        sorting.mergeLists(otherStudents);
        System.out.println("\nОбъединенные и отсортированные студенты:");
        sorting.outArray();
    }

    static class SortingStudentsByGPA {
        private List<Student> students;

        public SortingStudentsByGPA() {
            students = new ArrayList<>();
        }

        public void setArray() {
            students.add(new Student("Alice", "Smith", "Computer Science", 2, "CS-202", 3.5));
            students.add(new Student("Bob", "Johnson", "Mathematics", 1, "MATH-101", 3.8));
            students.add(new Student("Charlie", "Brown", "Physics", 3, "PHYS-303", 3.2));
        }

        public void quicksort() {
            students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        }

        public void outArray() {
            for (Student student : students) {
                System.out.println(student);
            }
        }

        public void mergeLists(List<Student> otherList) {
            students.addAll(otherList);
            quicksort(); // Sort after merging
        }
    }

    public static class Student {
        private String firstName;
        private String lastName;
        private String major;
        private int year;
        private String group;
        private double gpa; // Added GPA attribute

        public Student(String firstName, String lastName, String major, int year, String group, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.major = major;
            this.year = year;
            this.group = group;
            this.gpa = gpa; // Initialize GPA
        }

        public double getGpa() {
            return gpa; // Getter for GPA
        }

        @Override
        public String toString() {
            return "Student{" + "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", major='" + major + '\'' +
                    ", year=" + year +
                    ", group='" + group + '\'' +
                    ", gpa=" + gpa + '}'; // Include GPA in toString
        }
    }
}
