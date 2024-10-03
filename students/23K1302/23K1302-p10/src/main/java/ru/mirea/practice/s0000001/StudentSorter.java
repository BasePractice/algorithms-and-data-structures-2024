package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSorter {

    // ВАЖНО, я не мог использовать другое имя класса, PMD ругался

    private List<Student> students;

    public StudentSorter() {
        students = new ArrayList<>();
    }

    public void setArray() {
        students.add(new Student("Тимофей", "Мясников", "АСУ", 2, "КАБО-02-23", 4.5));
        students.add(new Student("Анна", "Дробина", "Педагог", 2, "РЭУ-23", 4.8));
        students.add(new Student("Иван", "Букин", "Архитектура", 1, "АРХ-24", 4.0));
    }

    public void quickSort() {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public void sortByLastName() {
        students.sort(Comparator.comparing(Student::getLastName));
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        StudentSorter sortingStudents = new StudentSorter();
        sortingStudents.setArray();

        System.out.println("Сортировка по GPA:");
        sortingStudents.quickSort();
        sortingStudents.outArray();

        System.out.println("\nСортировка по фамилии:");
        sortingStudents.sortByLastName();
        sortingStudents.outArray();
    }
}
