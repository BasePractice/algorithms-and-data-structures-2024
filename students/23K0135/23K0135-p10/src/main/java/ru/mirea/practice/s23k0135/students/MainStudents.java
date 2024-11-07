package ru.mirea.practice.s23k0135.students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class MainStudents {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Иван", "Петров", "Информатика", 3, "ИТ-321", 123456789, 5.0));
        studentList.add(new Student("Мария", "Иванова", "Экономика", 4, "ЭК-101", 456926493, 3.2));
        studentList.add(new Student("Алексей", "Сидоров", "Физика", 2, "ФЗ-202", 316302547, 4.2));

        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.setArray(studentList);

        sorter.sortByGpa();
        sorter.outArray();

        sorter.sortByName();
        sorter.outArray();

        sorter.sortByField(Comparator.comparing(Student::getSpec).reversed());
        sorter.outArray();
    }
}
